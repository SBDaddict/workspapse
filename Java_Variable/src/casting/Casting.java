package casting;

public class Casting {
    public static void main(String[] args){
        double dou = 84.5;
        int num = (int)dou;

        System.out.println(num);


        int i = 5;
        i++; // ++i 로 바꿔도 값은 같다
            System.out.println(i);
            i = 5;
            ++i;
            System.out.println(i);

            int e = 5, j = 0;
            j = e++;// 대입연산자 먼저 계산하고 후에 증감연산자 계산
            System.out.println("e="+ e + " j="+j);

            e = 5;
            j = 0;
            j = ++e;// 증감연산자 계산 후 대입연산자 적용
            System.out.println("e="+e + " j="+j);

            i = 5;
            j = 5;
            System.out.println(i++);// print 매서드 먼저 실행되고 나서 증감연산자 계산이 이루어져 출력에는 5로 나온다
            System.out.println(++j);// ++가 먼저 계산된 후 print 출력이 된다
            System.out.println("i="+i + " j="+j);

            int s = -10;
            s = +s;
            System.out.println(s);
            s = -10;// 부호 연산자 는 -,+ 가 있는데 +는 의미없고 -는 피연산자가 음수면 양수로 변환되고 양수면 음수로 변환한다
            s = -s;
            System.out.println(s);
    }
}
