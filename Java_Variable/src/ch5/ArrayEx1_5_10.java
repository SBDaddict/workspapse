package ch5;

import java.util.Arrays;

public class ArrayEx1_5_10 {
    public static void main(String[] args){
        int[] numArr = new int[10];
        for(int i = 0 ; i < numArr.length;i++){
            numArr[i] = (int)(Math.random()*10);
            System.out.print(numArr[i]);
        }System.out.println();
        for(int i = 0 ; i < numArr.length-1;i++){
            boolean stop = false;
            for(int j = 0; j < numArr.length-1-i;j++){
                if(numArr[j] > numArr[j+1]){
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    stop = true;
                    }
                }
            if(!stop)break;
            for(int k = 0 ; k < numArr.length ; k++)
                System.out.print(numArr[k]);
            System.out.println();
        }// j for and
    }// i for and
    }//main and

