package ch3;

public class OperationEx2_3_17 {
    public static void main(String[] args){
       double pi = 3.141592f;
       float shortPi = (int)(pi * 1000 + 0.5) / 1000f; // pi * 1000가 먼저
        // 수행되고 0.5를 더하면 3142가되어 반올림할 수 있다.
       System.out.println(shortPi);//3.142
    }
}
