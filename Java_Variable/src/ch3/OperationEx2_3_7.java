package ch3;

public class OperationEx2_3_7 {
    public static void main(String[] args){
       byte a = 10;
       byte b = 30;
       byte c = (byte)(a * b); // byte의 저장가능 공간이 -128~127이므로
        // 이 값이 넘어서 오버플로우가 발생하였다.
       System.out.println(c);
    }
}
