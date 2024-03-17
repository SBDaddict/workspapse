package memo;

import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
/*
문제: 사용자로부터 세 개의 정수를 입력받아, 이 중에서 가장 큰 수를 찾는 프로그램을 작성하세요.
프로그램은 다음과 같은 단계로 작동해야 합니다:
1. 사용자로부터 세 개의 정수를 입력받습니다.
2. 입력받은 세 정수 중에서 가장 큰 수를 찾습니다.
3. 찾은 가장 큰 수를 출력합니다.*/
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        System.out.println("num1에 들어갈 정수를 입력하세요");
        num1 = scanner.nextInt();
        System.out.println("num2에 들어갈 정수를 입력하세요");
        num2 = scanner.nextInt();
        System.out.println("num3에 들어갈 정수를 입력하세요");
        num3 = scanner.nextInt();
        //내가 작성한거
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("첫번째 수가 제일 큽니다.");
            }
        } else if (num2 > num3) {
            System.out.println("두번째 수가 제일 큽니다.");
        } else {
            System.out.println("세번째 수가 제일 큽니다.");
        }
        //정답
//        if (num1 >= num2 && num1 >= num3) {
//            System.out.println("첫번째 수가 제일 큽니다.");
//        } else if (num2 >= num1 && num2 >= num3) {
//            System.out.println("두번째 수가 제일 큽니다.");
//        } else {
//            System.out.println("세번째 수가 제일 큽니다.");
//        }

    }
}
