package ch3;

public class OperationEx2_3_2 {
    public static void main(String[] args){
        int i = 5, j= 0;
        j = i++;
        System.out.println("j = i++; 실행 후 i = "+i+" j = "+j);
        // i 값을 먼저 j에 저장하고나서 증가
        i = 5;
        j = 0;
        j = ++i;
        System.out.println("j = i++; 실행 후 i = "+i+" j = "+j);
        // i가 먼저 증가한 후 j에 저장

    }
}
