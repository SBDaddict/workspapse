package ch5;

import java.util.Arrays;

public class Ch5_7 {
    public static void main(String[] args){
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100,95,80,70,60};
        char[] chArr = {'a','b','c','d','e'};

        for(int i = 0 ; i <iArr.length ; i++){
            iArr[i] = i+1;
        }
        for(int i = 0 ; i < iArr2.length ; i++){

            iArr2[i] = (int)(Math.random() * 10+1);;
        }

        for(int i = 0 ; i < iArr.length ; i++){
            System.out.print(iArr[i]+",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(chArr);

    }
}
