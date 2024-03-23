package memo;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args){
        // 사용자에게 입력을 받아서 사각형의 넓이 구하는 코드
        int h = 0;
        int w = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("사갹형의 높이를 적어주세요. : ");
        h = scanner.nextInt();
        System.out.println("사갹형의 너비를 적어주세요. : ");
        w = scanner.nextInt();

        System.out.println("사각형의 넓이는"+h * w+"입니다.");

    }
}
