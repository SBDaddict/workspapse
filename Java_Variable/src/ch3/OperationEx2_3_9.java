package ch3;

public class OperationEx2_3_9 {
    public static void main(String[] args){
       int a = 1_000_000;
       int b = 2_000_000;

       long c = a * b; //-1454759936 이 결과도 오버플로우가 발생한다.
        // long타입의 c에 값을 넣기 전에 이미 int type으로 계산을 해서 long에 넣어도
        // 오버플로우가 발생 이 경우에는 (long)으로 형변환해준다.
       System.out.println(c);
    }
}
