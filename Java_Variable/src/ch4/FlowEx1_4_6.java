package ch4;

import java.util.Scanner;

public class FlowEx1_4_6 {
    public static void main(String[] args){
        System.out.print("현재월을 입력하세요. >");
        Scanner scanner = new Scanner(System.in);

        int month = 0;
        month = scanner.nextInt();

        switch (month){
            case 3 :
            case 4 :
            case 5 :
                System.out.println("현재 봄");
                    break;
            case 6 : case 7 : case 8 :
                System.out.println("여름");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("가을");
                break;
            default:
            case 12 : case 1 : case 2 :
                System.out.println("겨울");

        }

         }//main and
    }

