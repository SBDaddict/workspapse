package ch5;

public class Ch5_22 {
    public static void main(String[] args){
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };
        int sum = 0; //개인별 총점
        float avg = 0f;
        int korToTal = 0, engToTal = 0,mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("====================================");

        for(int i = 0 ; i < score.length ; i++){
            for(int j = 0 ; j < score[i].length ; j++){
                korToTal += score[i][0];
                engToTal += score[i][1];
                mathTotal += score[i][2];
                sum += score[i][j];
            }



            System.out.printf("%d %d %d %d %d%n",i+1,score[i][0],
                    score[i][1],score[i][2],sum);

        }
    }
}
