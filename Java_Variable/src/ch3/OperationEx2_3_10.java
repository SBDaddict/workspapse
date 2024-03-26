package ch3;

public class OperationEx2_3_10 {
    public static void main(String[] args){
       int a = 1_000_000;

       int result1 = a * a / a;
       int result2 = a / a * a;

       System.out.println(result1); // -727 result1은 먼저 곱하였기 때문에 오버플로우
       System.out.println(result2); // 1000000 result2 는 나누기를 먼저하였기에
        // 오버플로우는 발생하지 않는다/
    }
}
