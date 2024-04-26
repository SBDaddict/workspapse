package memo;

class Data {int x;}
public class ReferenceTest1 {
    public static void main(String[] args){
    Data d = new Data();
    d.x = 10;
    System.out.println(d.x);

    Data d2 = change(d);
    System.out.println(d.x = 10);
    d2.x = 1000;
    System.out.println(d2.x);

    }
    static Data change(Data d){
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
