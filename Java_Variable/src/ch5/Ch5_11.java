package ch5;

import java.util.Arrays;

public class Ch5_11 {

    public static void main(String[] args){
        int[] lotto = new int[45]; // int타입 배열 45개 선언
        int num = 0; // 섞어줄 그릇
        int num2 = 0;

        for(int i = 0 ; i < lotto.length;i++){
            lotto[i] += i+1;// lotto[]에 값저장
        }
        for(int j = 0 ; j < 7 ; j++){
            int r = (int)(Math.random() * 45);
            num = lotto[j];
            num2 = lotto[r];
            lotto[r] = num;
            lotto[j] = num2;
        }
        System.out.println(Arrays.toString(lotto));
        System.out.println("[1] = " + lotto[1]);
        System.out.println("[2] = " + lotto[2]);
        System.out.println("[3] = " + lotto[3]);
        System.out.println("[4] = " + lotto[4]);
        System.out.println("[5] = " + lotto[5]);
        System.out.println("[6] = " + lotto[6]);

    }
}
