package ch5;

import java.util.Arrays;

public class ArrayEx1_5_8 {
    public static void main(String[] args){
        int[] ball = new int[45];
        int tmp = 0;
        for(int i = 0 ; i < ball.length;i++){
            ball[i] = i+1;
        }
        for(int i = 0 ; i < 6;i++){
            int j = (int)(Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        for(int i = 0 ; i < 6 ; i++)
            System.out.println("ball["+i+"] = "+ball[i]);
    }

}
