package ch6;

import static ch6.Ch_6_9_PrimitiveParamEx.copy;
/*
class Data {int x;}
static Data copy(Data d) {
    Data tmp = new Data();
    tmp.x = d.x;

    return tmp;
    }
* */

public class Ch_6_14_ReferenceReturnEx {
    public static void main(String[] args) {
    Data d = new Data();
    d.x = 10;

    Data d2 = copy(d);
    System.out.println("d.x = " + d.x);
    System.out.println("d.x2 = " + d2.x);
    d2.x = 1000;
    System.out.println("d.x = " + d.x);
    System.out.println("d2.x = " + d2.x);
    }
}
