package ch3;

public class OperationEx2_3_6 {
    public static void main(String[] args){
       byte a = 10;
       byte b = 20;
       byte c = (byte)(a + b); // int로 자동 형변화되어 byte type변수 c에 값을 넣으려
        //하면 오류가 발생한다. 이렇땐 수동 형변환을 해주어야 정상적으로 수행된다.
       System.out.println(c);
    }
}
