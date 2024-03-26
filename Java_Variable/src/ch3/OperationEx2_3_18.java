package ch3;

public class OperationEx2_3_18 {
    public static void main(String[] args){
       double pi = 3.141592f;
       float shortPi = Math.round(pi * 1000) / 1000.0f; // pi * 1000가
        // 계산되어서 3141.592가 되고 Math.round 메서드에서 소수점 첫번째 자리에서
        // 반올림 되어 3142가 되고 / 1000.0f 로 나눠서 3.142가 된다.
       System.out.println(shortPi);//3.142
    }
}
