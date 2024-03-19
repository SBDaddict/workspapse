package ch5;

public class Ch5_21 {
    public static void main(String[] args){
        int[][] score = {
                        {100,100,100},
                        {20,20,20},
                        {30,30,30},
                        {40,40,40}
                        };
        int sum = 0; // 총합을 구하는 변수
        for(int i = 0 ; i < score.length ; i++){ //score.length은 score[] 의 값이니 4가 된다.
            for(int j = 0 ; j < score[i].length ; j++){//score[i].length는
                // score[][] 의 열에 값에 해당한다 그러므로 3이된다.
                // 2중 for문으로 4 * 3 = 12이니 총 12번 반복한다.
                System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
                sum += score[i][j];
            }
        }
        System.out.println("sum = "+sum);
    } // and main
}
