package ch3;

import java.util.Scanner;

public class OperationEx2_3_26 {
    public static void main(String[] args){
      int a = 5;
      int b = 0;
      System.out.printf("a = %d, b = %d%n",a,b);
      System.out.printf("a != 0 || ++b != 0 =%b%n",a != 0 || ++b != 0);
      System.out.printf("a=%d, b = %d%n",a,b);
      System.out.printf("a==0 && ++b !=0 = %b%n",a==0 && ++b !=0);
      System.out.printf("a=%d, b = %d%n",a,b);
    }
}
