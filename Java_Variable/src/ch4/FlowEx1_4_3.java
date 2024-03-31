package ch4;

import java.util.Scanner;

public class FlowEx1_4_3 {
    public static void main(String[] args){
       String input = "";
       System.out.println("숫자를 하나 입력하세요");
       Scanner scanner = new Scanner(System.in);
       int tem;
       input = scanner.nextLine();

       tem = Integer.parseInt(input);

       if(tem == 0){
           System.out.println("입력한 숫자는 0 입니다");
       }else{
           System.out.println("입력한 숫자는 0 이 아닙니다."+tem+"입니다.");
       }



    }

}
