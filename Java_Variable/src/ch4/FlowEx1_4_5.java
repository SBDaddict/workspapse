package ch4;

import java.util.Scanner;

public class FlowEx1_4_5 {
    public static void main(String[] args){
       int score = 0;
       char grade = ' ' ,opt = ' ';
       System.out.println("점수를 입력하세요");
       Scanner scanner = new Scanner(System.in);
       score = scanner.nextInt();

       if(score >= 90){
           grade = 'A';
           if(score >= 98){
               opt = '+';
           }else if(score < 94 ){
               opt = '-';
           }
           System.out.printf("당신의 학점은 %c%c 입니다%n",grade,opt);
       } else if (score >= 80) {
           grade = 'B';
           if(score >= 88){
               opt = '+';
           }else if(score < 84 ){
               opt = '-';
           }
           System.out.printf("당신의 학점은 %c%c 입니다%n",grade,opt);
       } else{
           grade = 'c';
           System.out.printf("당신의 학점은 %cㅋㅋ%n",grade);50
       }System.out.printf("당신의 점수는 %d 이며 학점은 %c 입니다.",score,grade);


    }//main and
    }

