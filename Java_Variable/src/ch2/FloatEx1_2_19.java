package ch2;

public class FloatEx1_2_19 {
    public static void main(String[] args){
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;
        System.out.printf("    123456789012345678901234%n");
        System.out.printf("f : %f%n",f);// 소수점 이하 6자리만 출력
        System.out.printf("f : %24.20f%n",f);
        System.out.printf("f2: %24.20f%n",f2);
        System.out.printf("d : %24.20f%n",d);
/*
      123456789012345678901234
f :   9.123457 마지막 자리가 6인데 반올림되어 7이됨
f :   9.12345695495605500000
f2:   1.23456788063049320000
d :   9.12345678901234600000*/

    }
}
