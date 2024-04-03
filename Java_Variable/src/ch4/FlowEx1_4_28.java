package ch4;

import java.util.Map;
import java.util.Scanner;

public class FlowEx1_4_28 {
    public static void main(String[] args){

        int random = (int)(Math.random()*100)+1;
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("1과 100사이의 정수를 입력하세요 >");
            num = scanner.nextInt();
            if(num < random){
                System.out.println("더 큰값을 입력하세요");
            }else if(num > random) {
                System.out.println("더 작은값을 입력하세요");
            }
        }while (num != random);
        System.out.println("정답입니다 답 : "+random);
         }//main and
    }

