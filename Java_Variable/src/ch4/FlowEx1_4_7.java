package ch4;

import java.util.Scanner;

public class FlowEx1_4_7 {
    public static void main(String[] args){
        System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random()*3)+1;
    System.out.println(user);
    System.out.println(com);
        switch (user-com){
            case 2 : case -1 :
                System.out.println("당싱이 졌음");
                break;
            case 1 : case -2 :
                System.out.println("당신이 이겼음");
                break;
            case 0 :
                System.out.println("비겼습니다.");
        }

         }//main and
    }

