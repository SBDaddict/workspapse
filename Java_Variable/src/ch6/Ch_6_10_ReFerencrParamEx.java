package ch6;
class Date2 {int x;}
public class Ch_6_10_ReFerencrParamEx {
    public static void main(String[] args){
    Date2 d = new Date2();
    d.x = 10;
    System.out.println("main() : x = " + d.x);

    chage(d);
    System.out.println("After change(d.x)");
    System.out.println("main() : x = " +d.x);
    }
    static void chage(Date2 d){
        d.x = 1000;
        System.out.println("change() : x = "+d.x);
    }
}
