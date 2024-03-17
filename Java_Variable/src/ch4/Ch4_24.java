package ch4;
import java.util.Scanner;
public class Ch4_24 {
    public static void main(String[] args){
        int menu = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        outer : while (true){// 무한반복문
            System.out.println("(1) spuare");
            System.out.println("(2) spuare root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료는 : 0)");

            String tmp = scanner.nextLine(); // 문자열을 입력받아서
            menu = Integer.parseInt(tmp); // 입력받은 문자열을 숫자로 변환 후 저장

            if(menu == 0){
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴선택을 잘못하셨습니다.(종료는 : 0, 프로그렘 종료 : 99)");
                continue;
            }
            System.out.println("선택한 메뉴는"+menu+"번 입니다.");
            outer2 : for(;;){
                System.out.println("계산할 값을 입력하세요. > (계산 종료는 0번)");
                String tmp2 = scanner.nextLine();
                num = Integer.parseInt(tmp2);
                if(num == 0)
                    break ;
                if(num  == 99)
                    break outer;

                switch (menu){
                    case 1 : System.out.println("result = " + num * num);
                        break;
                    case 2 : System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3 : System.out.println("result = " + Math.log(num));
                        break;
                }

            }
        }//while and
    System.out.println("프로그램이 종료되었습니다.");
    }// main and
}
