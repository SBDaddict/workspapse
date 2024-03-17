package memo;
import java.util.Scanner;
public class NumberPatternPrinter {
    public static void main(String[] args){
        /*문제: 사용자로부터 양의 정수 n을 입력받아, 다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
        예를 들어, n이 5일 경우 다음과 같은 패턴을 출력해야 합니다.
        1
        22
        333
        4444
        55555
        프로그램은 다음과 같은 단계로 작동해야 합니다:
        사용자로부터 양의 정수 n을 입력받습니다.
        1부터 n까지의 숫자를 이용하여 위와 같은 패턴을 출력합니다.*/
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("정수를 입력하세요");
        num = scanner.nextInt();
        for(int i = 0 ; i <= num ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i);
            }
            System.out.println();


        }

    }
}
