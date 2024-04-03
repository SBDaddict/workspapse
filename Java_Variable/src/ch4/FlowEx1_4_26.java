package ch4;

import java.util.Scanner;

public class FlowEx1_4_26 {
    public static void main(String[] args){
       int sum = 0;
       int num = 0;
        while((sum += ++num) < 100){
            System.out.printf("%d - %d%n",num,sum);
        }
         }//main and
    }

