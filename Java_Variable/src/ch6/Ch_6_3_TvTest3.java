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
public class Ch_6_3_TvTest3 {
        public static void main(String[] args){
       Tv t1 = new Tv(); // Tv인스턴스 참조변수 t1선언
       Tv t2 = new Tv();
       System.out.println("t1의 channel의 값은"+t1.channel+"이다.");
       System.out.println("t2의 channel의 값은"+t2.channel+"이다.");
       t2 = t1; // t1이 저장하고 있는 값을(주소) t2에 저장한다.
       t1.channel = 7; // 참조변수 t1의 멤버변수 channel의 값을 7로 초기화한다.
            System.out.println("t1의 값을"+t1.channel+"로 변경하였습니다.");
            System.out.println("t1의 channel의 값은"+t1.channel+"이다.");
            System.out.println("t2의 channel의 값은"+t2.channel+"이다.");

    }

}
