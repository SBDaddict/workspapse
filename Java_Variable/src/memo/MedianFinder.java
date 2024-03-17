package memo;
import java.util.Scanner;
public class MedianFinder {
    public static void main(String[] args) {
        /*
        문제: 사용자로부터 세 개의 정수를 입력받아, 이 중에서 중간값을 찾는 프로그램을 작성하세요.
        프로그램은 다음과 같은 단계로 작동해야 합니다:
        사용자로부터 세 개의 정수를 입력받습니다.
        입력받은 세 정수 중에서 중간값을 찾습니다.
        찾은 중간값을 출력합니다.
        */
        Scanner scanner = new Scanner(System.in);
        long num1 = 0l;
        long num2 = 0l;
        long num3 = 0l;
        System.out.println("num1에 들어갈 정수를 입력하세요");
        num1 = scanner.nextLong();
        System.out.println("num2에 들어갈 정수를 입력하세요");
        num2 = scanner.nextLong();
        System.out.println("num3에 들어갈 정수를 입력하세요");
        num3 = scanner.nextLong();

        if(num1 >= num2 && num1 <= num3){
            System.out.printf("num1 가 num2 보다 크고 num3 보다 작으므로 중간값은 num1입니다. ");
        } else if (num2 >= num1 && num2 <= num3) {
            System.out.printf("num2 가 num1 보다 크고 num3 보다 작으므로 중간값은 num2입니다. ");
        } else if (num3 >= num1 && num3 <= num2) {
            System.out.printf("num3 가 num1 보다 크고 num2 보다 작으므로 중간값은 num3입니다. ");
        }
    }
}
