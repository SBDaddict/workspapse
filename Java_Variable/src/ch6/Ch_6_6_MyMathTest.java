package ch6;
public class Ch_6_6_MyMathTest {
        public static void main(String[] args){
            MyMath mm = new MyMath(); // MyMath 객체 생성
            long result = mm.add(5L, 3L);
            long result2 = mm.subtract(5L, 3L);
            long result3 = mm.multiply(5L, 3L);
            double result4 = mm.divide(5L, 3L);// double이 아니라 long값으로 호출하였다.
            //이값은 자동형변환된다.
            System.out.println("add(5L,3L) = "+ result);
            System.out.println("subtract(5L,3L) = "+ result2);
            System.out.println("multiply(5L,3L) = "+ result3);
            System.out.println("divide(5L,3L) = "+ result4);



    }

}
class MyMath{
    long add(long a, long b){
        long result = a+b;
        return result;
        // return a + b 위의 두줄을 이와 같이 한줄로 간단히 할 수 있다.
    }
    long subtract(long a,long b){ return a - b;}
    long multiply(long a,long b){ return a * b;}
    double divide(double a, double b){
        return a / b;
    }
}
