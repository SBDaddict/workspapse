package ch2;

public class Ch2_9 {
    public static void main(String[] args) {
    // 두 변수의 값 바꾸기
        int x = 10, y = 20;
        int tmp;
        tmp = x;
        x = y;
        y = tmp;
        System.out.printf("y="+"%d%n",y);
        System.out.printf("x="+"%d%n",x);



    }
}
