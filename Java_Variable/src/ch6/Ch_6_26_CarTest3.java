package ch6;
class Car3{
    String color;
    String gearType;
    int door;

    Car3(){
        this("white","auto",4);
    }
    Car3(Car3 c){
        this(c.color, c.gearType, c.door);
    }
    Car3(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class Ch_6_26_CarTest3 {
    public static void main(String[] args){
        Car3 car1 = new Car3();
        Car3 car2 = new Car3(car1);
        System.out.println("c1의 color = "+car1.color+", gearType = "+car1.gearType+", door = "
                +car1.door);
        System.out.println("c2의 color = "+car2.color+", gearType = "+car2.gearType+", door = "
                +car2.door);
        car1.door = 100;
        System.out.println("car1.door에 값을 100으로 초기화");
        System.out.println("c1의 color = "+car1.color+", gearType = "+car1.gearType+", door = "
                +car1.door);
        System.out.println("c2의 color = "+car2.color+", gearType = "+car2.gearType+", door = "
                +car2.door);
    }
}
