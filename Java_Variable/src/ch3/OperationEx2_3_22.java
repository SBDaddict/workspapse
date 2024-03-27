package ch3;

public class OperationEx2_3_22 {
    public static void main(String[] args){
       float f = 0.1f;
       double d = 0.1;
       double d2 = (double)f;
       System.out.printf("10.0 == 10.0f %b%n",10.0 == 10.0f);
       System.out.printf("0.1 == 0.1f %b%n",0.1 == 0.1f);
       System.out.printf("f = %19.17f%n",f);
       System.out.printf("d = %19.17f%n",d);
       System.out.printf("d2 = %19.17f%n",d2);
        //10.0 == 10.0f true : 값의 오차가 없어서 true
        //0.1 == 0.1f false : double의 0.1 과 float 의 0.1f는 2진수로 변환하는 과정에서 오차가 발생하므로 false가 나온다
        //f = 0.10000000149011612
        //d = 0.10000000000000000
        //d2 = 0.10000000149011612

    }
}
