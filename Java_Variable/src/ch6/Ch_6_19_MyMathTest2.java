package ch6;
class MyMath2 {
    long a, b;
    // 인스턴스 변수를 사용하므로 im(인스턴스 메서드), 매개변수를 넣지않아도 상관없다.
    long add() {return a + b;}
    long subtract() {return a - b;}
    long multiply() {return a * b;}
    double divide() {return (double)a / b;}

    // 인스턴스 변수와 상관없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) {return a + b;} // a,b 는 지역변수 lv
    static long subtract(long a, long b) {return a - b;} // a,b 는 지역변수 lv
    static long multiply(long a, long b) {return a * b;} // a,b 는 지역변수 lv
    static double divide(double a, double b) {return a / b;} // a,b 는 지역변수 lv


}
public class Ch_6_19_MyMathTest2 {
    public static void main(String[] args){
        // 인스턴스 메서드 호출방법
        MyMath2 myMath2 = new MyMath2();
        myMath2.a = 200L;
        myMath2.b = 100L;
        System.out.println(myMath2.add());
        System.out.println(myMath2.subtract());
        System.out.println(myMath2.multiply());
        System.out.println(myMath2.divide());
        //클래스메서드 호출
        System.out.println(MyMath2.add(200,100));
        System.out.println(MyMath2.subtract(200,100));
        System.out.println(MyMath2.multiply(200,100));
        System.out.println(MyMath2.divide(200,100));

    }
}
