package ch3;

public class OperationEx2_3_5 {
    public static void main(String[] args){
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n",a,b,a+b);
        System.out.printf("%d - %d = %d%n",a,b,a-b);
        System.out.printf("%d * %d = %d%n",a,b,a*b);
        System.out.printf("%d / %d = %d%n",a,b,a/b);
        System.out.printf("%d / %f = %f%n",a,(float)b,a/(float)b);
        // 10을 4로 나누면 2.5가 나와야 하지만 int 정수라 .5는 잘려나가 2가 출력됨,
        // 둘중 하나의 변수를 float나 double로 형변환 하여야 정상적으로 2.5가 출력된다.
    }
}
