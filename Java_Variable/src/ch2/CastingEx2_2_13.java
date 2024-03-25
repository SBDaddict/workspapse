package ch2;

public class CastingEx2_2_13 {
    public static void main(String[] args){
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int - > byte] i = %d - > b = %d%n",i,b);
        // 동일함
        i = 300;
        b = (byte)i;
        System.out.printf("[int - > byte] i = %d - > b = %d%n",i,b);
        // [int - > byte] i = 300 - > b = 44 값이 짤림

        b = 10;
        i = (int)b;
        System.out.printf("[byte - > int] b = %d - > i = %d%n",b,i);
        //[byte - > int] b = 10 - > i = 10 동일함 작은 그릇을 큰그릇에 넣으니
        b = -2;
        i = (int)b;
        System.out.printf("[byte - > int] b = %d - > i = %d%n",b,i);
        //[byte - > int] b = -2 - > i = -2 마찬가지
    }
}
