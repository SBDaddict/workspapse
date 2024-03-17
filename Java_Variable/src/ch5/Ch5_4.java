package ch5;

public class Ch5_4 {
    public static void main(String[] args){

        int[] arr = new int[7];
        System.out.println("arr.length = "+arr.length);

        for(int i = 0; i < arr.length ; i++){ // 배열을 for문으로 돌릴때
            // arr.length를 사용하면 좋다
            System.out.println("arr["+i+"]="+arr[i]);

        }
    }
}
