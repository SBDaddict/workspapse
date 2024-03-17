package ch4;
import java.util.Scanner;
public class Ch4_22 {
    public static void main(String[] args){
        int menu = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){// 무한반복문
            System.out.println("(1) spuare");
            System.out.println("(2) spuare root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0번 > ");

            String tmp = scanner.nextLine(); // 문자열을 입력받아서
            menu = Integer.parseInt(tmp); // 입력받은 문자열을 숫자로 변환 후 저장

            if(menu == 0){
                System.out.println("프로그렘을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴선택을 잘못하셨습니다.(종료는 : 0)");
                continue;
            }
        System.out.println("선택한 메뉴는"+menu+"번 입니다.");
        }
    }
}
