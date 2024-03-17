package ch5;

public class Ch5_9 {
    public static void main(String[] args){
        // 최대값과 최소값 : 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다
        int[] score = {79,88,91,33,100,55,95};
        int max = score[0];
        int min = score[0];
        for(int i = 1 ; i < score.length ; i++){
            if(max < score[i]){
                max = score[i];
            }else if(min > score[i]){
                min = score[i];
            }
        }// and for
        System.out.println("score 배열의 최대값은 : "+max);
        System.out.println("score 배열의 최소값은 : "+min);

    }// and main
}
