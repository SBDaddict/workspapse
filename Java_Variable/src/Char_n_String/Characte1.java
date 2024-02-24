package Char_n_String;
public class Characte1 {
    public static void main(String[] args){

        String name = "ja"+"va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + "");// 7과같은 기본형타입의 값을 문자열로 전환하려면 ""를 + 덧셈연산자로 붙여주면 가능하다
        System.out.println(" " + 7);
        System.out.println(7 + 7 + " ");// 왼쪽에서 오른쪽으로 연산을 수행하기에 7+7을 먼저 수행하여 14가 나온다
        System.out.println(7 + "" + 7);// 왼쪽에서 오른쪽으로 연산을 수행하기에 7을 먼저 문자열로 만들어 77이 나온다

        byte b = 1;
        short s = 2;
        char c = 'A';
        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int nexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d%n", b);// 여기서 %d는 10진수를 표현하는것, %n은 줄바꿈
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%1d]%n", finger);// finger 의 값이 10이므로 출력결과도 finger=[10]
        System.out.printf("finger=[%2d]%n", finger);// finger 의 값이 10이므로 두자리수 출력결과도 finger=[10]
        System.out.printf("finger=[%3d]%n", finger);/*
         finger 의 값이 10이므로 세자리수 출력결과는 finger=[ 10] 즉,
         %2d의 최소 필드 폭이 finger 변수의 값을 제한하는 것이 아니라,
         최소 필드 폭이 더 큰 값일 경우에만 의미가 있습니다.
         예를 들어, %4d로 설정하면 [finger= 10]와 같이 출력될 것
        */
        System.out.printf("finger=[%4d]%n", finger);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);






    }
}
