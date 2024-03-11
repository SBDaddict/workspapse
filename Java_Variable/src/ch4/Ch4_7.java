package ch4;
import java.util.Scanner;
public class Ch4_7 {
    public static void main(String[] args){

        int score = 0;
        char grade = 'C';
        char plus = ' ';
        System.out.print("여기에 점수를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 : %d 입니다. %n",score);
        if(score >= 90){
            grade = 'A';
            if(score >= 98){
                plus = '+';
            }else if(score  < 94){
                plus = '-';
            }else {
                plus = ' ';
            }
        }else if(score >= 80) {
            grade = 'B';
            if(score >= 88){
                plus = '+';
            }else if(score  < 84){
                plus = '-';
            }else {
                plus = ' ';
            }
        }else if(score >= 70){
            grade = 'C';
            if(score >= 78){
                plus = '+';
            }else if(score  < 74){
                plus = '-';
            }else {
                plus = ' ';
            }
        }
    System.out.printf("당신의 학점은 : %c%c 입니다.",grade,plus);
    }
}
