package ch6;
class Data {int x;}
public class Ch_6_9_PrimitiveParamEx {
    public static void main(String[] args){
    Data d = new Data();
    d.x = 10;
    System.out.println("main() : x = " + d.x);

    chage(d.x);
    System.out.println("After change(d.x)");
    System.out.println("main() : x = " +d.x);
    }
    static void chage(int x){
        x = 1000;
        System.out.println("change() : x = "+x);
    }
    static Data copy(Data d) {
    Data tmp = new Data();
    tmp.x = d.x;

    return tmp;
    }
}
