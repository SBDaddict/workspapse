package ch4;

import java.util.Scanner;

public class FlowEx1_4_8 {
    public static void main(String[] args){

        System.out.println("당신의 주민번호를 적으세요 : ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender){
            case '1': case '3': // char 값이니까 ''로 묶어줘야함
                System.out.println("당신은 남자입니다.");
                break;
            case '2': case '4':
                System.out.println("당신은 여성입니다.");
                break;
            default:
                System.out.println("주민번호를 잘못입력하셨습니다.");
        }

         }//main and
    }

