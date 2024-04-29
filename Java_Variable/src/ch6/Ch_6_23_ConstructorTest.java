package ch6;
class Data1{
   int value;
}
class Data2{
    Data2(){};//기본 생성자를 만들어줘야 compile error가 안생긴다.
    int value;
    Data2(int x){ // 매개변수가 있는 생성자
        value = x;
    }
}
public class Ch_6_23_ConstructorTest {
    public static void main(String[] args){
Data1 d1 = new Data1();
Data2 d2 = new Data2(); // compile error발생

    }
}
