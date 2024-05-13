package ch7;

public class Ch_7_18_BindingTest {

	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = new Child2();
	System.out.println("p.x = "+p.x); // 참조변수 타입에 따라 조상 클래스의 p.x가 호출되었다.
	p.method(); // 오버라이딩된 메서드가 호출된다
	
	System.out.println("c.x = "+c.x); 
	c.method();

	}

}
class Parent2{
	int x = 100;
	void method() {
		System.out.println("Parent2 method");
	}
}
class Child2 extends Parent2{
	int x = 200;
	void method() {
		System.out.println("Child2 method");
	}	
}
