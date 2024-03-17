package memo;
import java.util.Scanner;
public class EvenNumberFinder {
    public static void main(String[] args){
        /*
        문제: 사용자로부터 두 개의 정수를 입력받아,
        두 수 중에서 짝수인 수만 출력하는 프로그램을 작성하세요.
        프로그램은 다음과 같은 단계로 작동해야 합니다:
        사용자로부터 두 개의 정수를 입력받습니다.
        입력받은 두 정수 중에서 짝수인 수를 찾습니다.
        찾은 짝수를 출력합니다.*/
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    int num2 = 0;
    String score = "";
    String score2 = "";
        System.out.println("첫번째 정수를 입력하세요");
        score = scanner.nextLine();
        num = Integer.parseInt(score);
        System.out.println("두번째 정수를 입력하세요");
        score2 = scanner.nextLine();
        num2 = Integer.parseInt(score2);
        if(num % 2 == 0 && num2 % 2 == 0){
            System.out.println("두 수 모두 짝수입니다.");
        } else if (num % 2 == 0) {
            System.out.println("첫번째 수는 짝수입니다.");
        } else if (num2 % 2 == 0) {
            System.out.println("두번째 수는 짝수입니다.");
        }else{
            System.out.println("두 수 모두 홀수 입니다.");
        }
    }// main and
}
