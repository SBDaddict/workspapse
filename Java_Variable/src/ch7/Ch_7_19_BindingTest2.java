package ch7;

public class Ch_7_19_BindingTest2 {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		Child3 c = new Child3();
	System.out.println("p.x = "+p.x); // 참조변수 타입에 따라 조상 클래스의 p.x가 호출되었다.
	p.method(); // 오버라이딩된 메서드가 호출된다
	
	System.out.println("c.x = "+c.x); 
	c.method();

	}

}
class Parent3{
	int x = 100;
	void method() {
		System.out.println("Parent2 method");
	}
}
class Child3 extends Parent3{}
