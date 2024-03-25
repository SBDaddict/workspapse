package ch2;

public class CastingEx1_2_12 {
    public static void main(String[] args){
        double d = 85.4;
        int score = (int)d;
        System.out.println("score = "+ score);
        System.out.println("d = "+d);// d = 85.4 형변환 후에도 기존 값은 변화가 없다.
    }
}
