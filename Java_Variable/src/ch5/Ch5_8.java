package ch5;

public class Ch5_8 {
    public static void main(String[] args){
        //배열의 총합과 평균 구하기
        int[] num = {100,88,100,100,90};
        int sum = 0; // 총합을 구하기 위한 변수
        float aver = 0f; // 평균을 구하기 위한 변수
        for(int i = 0 ; i < num.length ; i++){
            sum += num[i];
        }
        System.out.println("총합은 : "+sum);
        aver = sum / (float)num.length; // 평균을 구할때 둘중 하나를 float로 형변환
        // 해주어야 정상적으로 구할 수 있다.
        System.out.println("평균은 : "+ aver);
    }
}
