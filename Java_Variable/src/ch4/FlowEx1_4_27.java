package ch4;

import java.util.Scanner;

public class FlowEx1_4_27 {
    public static void main(String[] args){
        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int sum = 0;
        while(flag){
            int num = scanner.nextInt();
            System.out.println(">>"+num);
            if(num != 0){
                sum += num;
            }else {
                flag = false;
            }
        }System.out.println("합계 : "+sum);
         }//main and
    }

