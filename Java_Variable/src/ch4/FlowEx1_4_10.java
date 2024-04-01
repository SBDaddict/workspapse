package ch4;

import java.util.Scanner;

public class FlowEx1_4_10 {
    public static void main(String[] args){

        System.out.println("당신의 점수를 입력하세요 -> (0~100) ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int score = Integer.parseInt(tmp);

        switch (score/10){// 89를 10으로 나누면 8.9지만 int, int type 끼리 계산이므로 int값을 반환한다
            //그래서 8.9의 실수부분(0.9)이 짤려 8이 나온다
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            default:
                System.out.println("F");
        }

         }//main and
    }

