package memo;
import java.util.Scanner;

public class Gogodan2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("1~9까지 원하는 구구단 숫자를 입력하세요");
            input = scanner.nextInt();
            if (input >= 1 && input <= 9) {
                for (int i = input; i == input; i++) {
                    for (int j = 1; j <= 9; j++) {
                        int num = i * j;
                        System.out.printf("%d * %d = %d%n", i, j, num);
                    }
                }
            } else {
                System.out.println("1부터 9까지의 숫자만 입력해주세요.");
                continue; // 입력이 올바르지 않으면 처음으로 돌아가기
            }
        } while (true);// 무한루프를 이용하기
    }
}
