package ch6;

public class Ch_6_7_CallStackTest {
    public static void main(String[] args){
        Method.firstMethod();
    }
}
class Method{
    static void firstMethod(){
        System.out.println("firstMethod() 가 시작되었음");
        secondMethod();
        System.out.println("firstMethod() 가 종료되었음");
    }

    static void secondMethod(){
        System.out.println("secondMethod() 가 시작되었음");
        System.out.println("secondMethod() 가 종료되었음");
    }
}
