package ch5;

import java.util.Arrays;

public class Ch5_10 {
    public static void main(String[] args){
        //배열의 값을 서로 섞기
        int[] num = {0,1,2,3,4,5,6,7,8,9};// int타입 배열 10개 선언 및 초기화
        System.out.println(Arrays.toString(num));

        for(int i = 0 ; i < 100 ; i++){// 100번 두 요소값 바꾸기
            int random = (int)(Math.random()* 10);// num의 index값으로 맞춰서 10개
            int tmp = num[0];
            num[0] = num[random];
            num[random] = tmp;

        }
        System.out.println(Arrays.toString(num));



    }
}
