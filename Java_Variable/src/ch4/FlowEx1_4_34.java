package ch4;

import java.util.Scanner;

public class FlowEx1_4_34 {
    public static void main(String[] args){
      int menu, num;
        Scanner scanner = new Scanner(System.in);

        outer : while(true){
            System.out.printf("(1) square%n(2) square root%n(3) log%n" +
                    "원하는 메뉴 (1~3)를 선택하세요. (종료는 0)");
            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu == 0){
                System.out.println("종료되었습니다.");
                break;
            }else if(!(1 <= menu && menu <=3)){
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;
            }
                System.out.println("선택하신 메뉴는"+menu+"번 입니다.");
         for(;;){
                System.out.println("계산할 값을 입력하세요.(계산 종료 : 0, 전체 종료 : 99)");
                String str = scanner.nextLine();
                num = Integer.parseInt(str);
                if(num == 99) {
                    System.out.println("전체 종료되었습니다.");
                    break outer;
                }else if(num == 0){
                    System.out.println("계산 종료되었습니다.");
                    break;
                }
                switch (menu){
                    case 1 : System.out.println("result="+num*num);
                    break;
                    case 2 : System.out.println("result="+Math.sqrt(num));
                    break;
                    case 3 : System.out.println("result="+Math.log(num));
                    break;
                }//switch and
            }//for and
        }//while and
    }//main and
    }

