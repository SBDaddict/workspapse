package ch5;

import java.util.Arrays;

public class ArrayEx1_5_9 {
    public static void main(String[] args){
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for(int i = 0 ; i < arr.length;i++){
            int y = (int)(Math.random()* code.length);
            arr[i] = code[y];
        }System.out.println(Arrays.toString(arr));
    }

}
