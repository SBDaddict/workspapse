package ch3;

public class OperationEx2_3_4 {
    public static void main(String[] args){
        int i = -10;
        i = +i;
        System.out.println(i); // -10 + 부호연산자는 하는 일이 없다.

        i = -10;
        i = -i;
        System.out.println(i);// 10 -부호연산자는 값을 반대로 바꾼다.

    }
}
