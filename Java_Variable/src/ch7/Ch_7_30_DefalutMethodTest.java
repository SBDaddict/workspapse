package ch7;

public class Ch_7_30_DefalutMethodTest {

	public static void main(String[] args) {
	Child5 child5 = new Child5();
	child5.method1();
	Parent5 parent5 = new Parent5();
	parent5.method2();
	MyInterface.staticMethod(); // static 메서드 불러올때 인터페이스도 클래스처럼 인터페이스명.메서드명 이렇게 불러온
	MyInterface2.staticMethod();
	}

}

class Child5 extends Parent5 implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in Child"); // 오버라이
	}
}
class Parent5 {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}
interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}
