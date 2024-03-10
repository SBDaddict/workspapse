package ch3;

public class Ch3_10 {
    public static void main(String[] args){
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;
        System.out.println(c);

        long d = (long)a * b;
        System.out.println(d);


    }
}
