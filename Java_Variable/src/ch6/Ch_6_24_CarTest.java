package ch6;
class Car{
    Car(){}
    String color; // 차량 색상
    String gearType; // 기어타입
    int door; // 문의 개수

    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
public class Ch_6_24_CarTest {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white","auto",4);
        System.out.println( "c1의 차량 색상 : "+c1.color+", 기어타입 : "+c1.gearType+", 문의 개수 : "+ c1.door);
        System.out.println("c2의 차량 색상 : "+c2.color+", 기어타입 : "+c2.gearType+", 문의 개수 : "+ c2.door);
    }

}
