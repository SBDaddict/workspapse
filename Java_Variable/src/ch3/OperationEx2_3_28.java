package ch3;

import static java.lang.Integer.toBinaryString;

public class OperationEx2_3_28 {
    public static void main(String[] args){
      int x = 0xAB, y = 0xf;

      System.out.printf("x = %X \t\t%s%n", x, toBinaryString(x));
      System.out.printf("y = %X \t\t%s%n", y, toBinaryString(y));
      System.out.printf("%#X | %#X = %#X \t%s%n",x,y,x | y,toBinaryString(x | y));
      System.out.printf("%#X & %#X = %#X \t%s%n",x,y,x & y,toBinaryString(x & y));
      System.out.printf("%#X ^ %#X = %#X \t%s%n",x,y,x ^ y,toBinaryString(x ^ y));
      System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n",x,y,y,x ^ y ^ y,toBinaryString(x ^ y ^ y));

    }
}
