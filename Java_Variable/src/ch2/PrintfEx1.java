package ch2;

public class PrintfEx1 {
    public static void main(String[] args) {
      System.out.printf("%d%n",15);
      System.out.printf("%o%n",15);// 8진수
      System.out.printf("%x%n",15);// 16진수
        System.out.printf("%#o%n",15);// 8진수 #은 앞에 기호를 추가
        System.out.printf("%#x%n",15);// 16진수
      System.out.printf("%s%n",Integer.toBinaryString(15));// 2진수로 표현 문자열로 나옴
    float f = 123.456789f;
    System.out.printf("%f%n",f);
    System.out.printf("%e%n",f);
    System.out.printf("%g%n",f);
        double d = 123.456789;
        System.out.printf("%f%n",d);
        System.out.printf("[%5d]%n",10);
        System.out.printf("[%-5d]%n",10);
        System.out.printf("[%05d]%n",10);
        String url = "www.najoon.com";
        System.out.printf("[%s]%n",url);
        System.out.printf("[%20s]%n",url);
        System.out.printf("[%-20s]%n",url);
        System.out.printf("[%8s]%n",url);// 지정된 자리수보다 출력값이 크면 짤리는게 아니라 지정한 자리수와 상관없이 전부 출력한다




    }
}
