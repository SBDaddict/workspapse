package ch6;

public class Ch_6_11_ReferanceParamEx2 {
    public static void main(String[] args){
        int[] tvArr = {10};
        System.out.println("main() : tvArr ="+tvArr[0]);
        change(tvArr);
        System.out.println("After change(tvArr)");
        System.out.println("main() : tvArr ="+tvArr[0]);
    }
    static void change(int[] x){
        x[0] = 1000;
        System.out.println("change() : tvArr ="+ x[0]);
    }
}
