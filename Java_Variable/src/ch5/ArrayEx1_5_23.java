package ch5;

import java.util.Scanner;

public class ArrayEx1_5_23 {
    public static void main(String[] args){
       String[][] words = {
               {"chair","의자"},
               {"computer","컴퓨터"},
               {"integer","정수"}
       };
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i< words.length;i++){
            System.out.printf("Q%d. %s의 뜻은?%n",i+1,words[i][0]);
            String qzi = scanner.nextLine();
            if(qzi.equals(words[i][1])){
                System.out.println("정답입니다.");
            }else{
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n",words[i][1]);
            }
        }
    }//main and

}
