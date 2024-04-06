package ch5;

public class ArrayEx1_5_5 {
    public static void main(String[] args){
       int sum = 0;
       double ave = 0.0;
       int[] score = {100,88,100,100,90};
       for(int i = 0 ; i < score.length ; i++){
           sum += score[i];
       }
       ave = sum / (double)score.length;

       System.out.println("총점 : "+ sum);
       System.out.println("평균 : "+ave);
    }

}
