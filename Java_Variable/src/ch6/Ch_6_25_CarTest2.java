package ch6;
class Car2{
    String color;
    String gearType;
    int door;
    Car2(){
        this("white","auto",4);
    }
    Car2(String color){
        this(color,"auto",4);
    }
    Car2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
        }
public class Ch_6_25_CarTest2 {
    public static void main(String[] args){
        Car2 car1 = new Car2();
        Car2 car2 = new Car2("blue");
        System.out.println("c1의 color = "+car1.color+", gearType = "+car1.gearType+", door = "
        +car1.door);
        System.out.println("c2의 color = "+car2.color+", gearType = "+car2.gearType+", door = "
                +car2.door);
    }
}
