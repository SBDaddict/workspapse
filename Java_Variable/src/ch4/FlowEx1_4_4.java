package ch4;

import java.util.Scanner;

public class FlowEx1_4_4 {
    public static void main(String[] args){
       int score = 0;
       char grade = ' ';
       System.out.println("점수를 입력하세요");
       Scanner scanner = new Scanner(System.in);
       score = scanner.nextInt();

       if(score >= 90){
           grade = 'A';
           System.out.printf("당신의 학점은 %c 입니다%n",grade);
       } else if (score >= 80) {
           grade = 'B';
           System.out.printf("당신의 학점은 %c 입니다%n",grade);
       } else if (score >= 70){
           grade = 'C';
           System.out.printf("당신의 학점은 %c%n",grade);
       } else{
           grade = 'D';
           System.out.printf("당신의 학점은 %cㅋㅋ%n",grade);
       }System.out.printf("당신의 점수는 %d 이며 학점은 %c 입니다.",score,grade);


    }//main and
    }

