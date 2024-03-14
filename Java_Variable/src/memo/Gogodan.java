package memo;
import java.util.Scanner;
public class Gogodan {
    public static void main(String[] args){

        // 사용자가 1~9 까지 구구단중 하나를 입력하면 그에 맞는 구구단이 출력되는 코드를 작성하시오
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do{
            System.out.println("1~9까지 원하는 구구단 숫자를 입력하세요");
        input = scanner.nextInt();
        if(input <= 9) {
            for (int i = input; i == input; i++) {
                for (int j = 1; j <= 9; j++) {
                    int num = i * j;
                    System.out.printf("%d * %d = %d%n", i, j, num);
                }
            }
        }
        }while (input <= 9);



    }
}
