package ch2;

public class Ch2_17 {
    public static void main(String[] args) {
    String str = "3";

        System.out.println(str.charAt(0) - '0');
    /* str = "3", .charAt(0)은 문자로 변환하는 코드 문자'0' 을 - 빼주면 숫자 3으로 변환된다*/
        System.out.println('3' - '0' + 1);
        /*문자 '3' - '0' 은 숫자 3으로 변환되고 +1 을 더해서 4가 출력된다*/
        System.out.println(Integer.parseInt(str) + 1);
        /*이것 역시 문자열 "3"을 숫자 3으로 변화하여 +1 더하라는 코드*/
        System.out.println("3" + 1);
        /*이건 문자열 과 숫자를 더해서 1이 문자열 "1" 이 된다. 그래서 "3""1" 이 출력되 31이 나온다*/
        System.out.println(3 + '0');
        // '0'은 숫자로 48이다 그래서 51이 출력된다.

    }
}
