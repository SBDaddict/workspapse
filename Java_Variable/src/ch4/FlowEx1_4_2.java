package ch4;

import java.util.Scanner;

public class FlowEx1_4_2 {
    public static void main(String[] args){
       String input = "";
       System.out.println("숫자를 하나 입력하세요");
       Scanner scanner = new Scanner(System.in);
       int tem;
       input = scanner.nextLine();

       tem = Integer.parseInt(input);

       if(tem == 0){
           System.out.println("입력한 숫자는0입니다.");
       }
       if(tem != 0) {
           System.out.println("입력하신 숫자는 0이 아닙니다.");
           System.out.printf("입력하신 숫자는 %d입니다.", tem);
       }



    }

}
