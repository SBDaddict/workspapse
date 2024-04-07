package ch5;

public class ArrayEx1_5_11 {
    public static void main(String[] args){
        int[] numArr = new int[10];
        int[] count = new int[10];
        for(int i = 0 ; i < numArr.length;i++){
            numArr[i] = ((int) (Math.random() * 10));
            System.out.print(numArr[i]);
        }System.out.println();
        for(int j = 0; j < count.length;j++){
            count[numArr[j]]++;
            System.out.print(j+"번은 : "+"["+count[j]+"]"+"번");
            System.out.println();
        }
    }//main and

}
