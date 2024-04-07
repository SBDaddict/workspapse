package ch5;

import java.util.Arrays;

public class ArrayEx1_5_10 {
    public static void main(String[] args){
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length;i++){
            System.out.print(numArr[i]= (int)(Math.random()*10));
        }System.out.println();

        for(int i = 0;i < numArr.length-1;i++){
            boolean change = false;
            for(int j = 0 ; j < numArr.length-1-i;j++){
                if(numArr[j]>numArr[j+1]){
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    change = true;
                }
            }//for j and
            if(!change)break;
            for(int k = 0 ; k < numArr.length;k++){
                System.out.print(numArr[k]);
            }
            System.out.println();
        }//for i and
    }//main and

}
