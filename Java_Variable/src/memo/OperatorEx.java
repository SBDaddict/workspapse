package memo;

import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args){
        char ch = ' ';
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 하나 입력하세요.>");
        String a = scanner.nextLine();
        ch = a.charAt(0);

        if('0' <= ch && ch <= '9'){
                System.out.println("입력하신 문자는 숫자입니다.");
        }else {
            System.out.println("입력하신 문자는 영문자입니다.");
        }

    }
}
