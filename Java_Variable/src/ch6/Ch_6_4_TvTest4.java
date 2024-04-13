package ch6;
/*
class Tv { // 예제 6-1에 생성한 클래스
    // tv의 속성(멤버변수)
    String color; // 색상
    boolean power; // 전원상태(on, off)
    int channel; // 채널
    // tv의 기능(메서드)
    void power(){power = !power;}// 채널을 켜거나 끄는 기능을 하는 메서드
    void channelUp(){++channel;}// tv의 채널을 높이는 기능을 하는 메서드
    void channelDown(){--channel;}// tv의 채널을 낮추는 기능을 하는 메서드
}*/
public class Ch_6_4_TvTest4 {
        public static void main(String[] args){
       Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열
       // Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
       for(int i = 0; i < tvArr.length ; i++){
           tvArr[i] = new Tv();
           tvArr[i].channel = i+10; // tvArr[i]째 Tv인스턴스 멤버변수 channel에 i+10을 저장
       }
       for(int i = 0 ; i < tvArr.length ; i++){
           tvArr[i].channelUp();
           System.out.printf("tvArr[%d].channel = %d%n",i,tvArr[i].channel);
       }
    }

}
