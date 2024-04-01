package ch4;

import java.util.Scanner;

public class FlowEx1_4_11 {
    public static void main(String[] args){

        System.out.println("당신의 주민번호를 적으세요 : ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender){
            case '1': case '3': // char 값이니까 ''로 묶어줘야함
                switch (gender){
                    case '1' :
                        System.out.println("당신은 2000년생 이전 남자입니다");
                        break;
                    case '3' :
                        System.out.println("당신은 2000년생 이후 남자입니다.");
                }
                break;
            case '2': case '4': // char 값이니까 ''로 묶어줘야함
                switch (gender){
                    case '2' :
                        System.out.println("당신은 2000년생 이전 여자입니다");
                        break;
                    case '4' :
                        System.out.println("당신은 2000년생 이후 여자입니다.");
                }
                break;
            default:
                System.out.println("주민번호를 잘못입력하셨습니다.");
        }

         }//main and
    }

