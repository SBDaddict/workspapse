package ch4;
import java.util.Scanner;
public class Ch4_19 {
    public static void main(String[] args){
        //random으로 생성된 1~100 값을 사용자가 맞추는 게임, 사용자가 입력한 값이 생성된 값보다
        //크거나 작으면 알려준다.
    int input = 0, random = 0;
    random = ((int)(Math.random() * 100) + 1);
        Scanner scanner = new Scanner(System.in);
    do{
        System.out.println("값을 입력하세요 : ");
        input = scanner.nextInt();
        if(random > input){
            System.out.println("random값이 더 큽니다");
        }else if(random < input){
            System.out.println("random값이 더 작습니다");
        }
    }while (random != input);

    System.out.printf("정답은 %d 입니다. 축하합니다.%n",random);


    }
}
