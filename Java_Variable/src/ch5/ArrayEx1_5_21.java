package ch5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1_5_21 {
    public static void main(String[] args){
       final int SIZE = 5;
       int x = 0,y = 0,num = 0;
        int[][] bingGo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < SIZE;i++) {
            for (int j = 0; j < SIZE; j++) {
                bingGo[i][j] = i * SIZE + j + 1; // i 가 2 j 가 1 bingGo[2][1] = 2 * 5 + 1 + 1
            }
        } // for and
        for(int i = 0 ; i < SIZE;i++){
            for(int j = 0; j<SIZE;j++){
                x = (int)(Math.random()*SIZE);
                y = (int)(Math.random()*SIZE);
                //bingGo[i][j] 와 bingGo[x][y]값을 바꾼다.
                int tmp = bingGo[i][j];
                bingGo[i][j] = bingGo[x][y];
                bingGo[x][y] = tmp;
            }
        }
        do{
            for(int i = 0; i < SIZE;i++){
                for(int j = 0; j < SIZE;j++)
                    System.out.printf("%2d ",bingGo[i][j]);
                System.out.println();
            }
            System.out.println();
            System.out.printf("1~%d의 숫자를 입력하세요.(종료.0)>",SIZE*SIZE);
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);
            outer:
                for(int i = 0 ;i<SIZE;i++){
                    for(int j = 0;j<SIZE;j++){
                        if(bingGo[i][j]==num){
                            bingGo[i][j] = 0;
                            break outer;
                        }
                    }
                }
        }while (num != 0);
    }//main and

}
