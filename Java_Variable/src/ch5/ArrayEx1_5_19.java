package ch5;

public class ArrayEx1_5_19 {
    public static void main(String[] args){
        int[][] score = {
                {100,100,100}
                ,{20,20,20}
                ,{30,30,30}
                ,{40,40,40}
                ,{50,50,50}
        };// 2차원 배열 int[][] score = new int[5][3]; 을 선언과 초기화 하였다.
        int korea = 0 , eng = 0, math = 0;

        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("==================================");
        for(int i = 0;i < score.length;i++){
            int sum = 0;
            float avg = 0.0f;
            korea += score[i][0];
            eng += score[i][1];
            math += score[i][2];
            for(int j = 0; j < score[j].length;j++){
                sum += score[i][j];
                avg = sum / (float)score[j].length;
            }
            for(int k = 0; k < 1;k++){
                System.out.printf("%d\t%d\t%d\t%d\t%d\t%5.1f",i+1,score[i][k],score[i][k],score[i][k],sum,avg);
            }System.out.println();
        }
        System.out.println("==================================");
        System.out.printf("총점:%d %d %d %n",korea,eng,math);
    }//main and

}
