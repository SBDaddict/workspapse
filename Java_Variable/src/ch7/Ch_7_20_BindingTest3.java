package ch7;

public class Ch_7_20_BindingTest3 {

	public static void main(String[] args) {
		Parent4 p = new Child4();
		Child4 c = new Child4();
	System.out.println("p.x = "+p.x); // 참조변수 타입에 따라 조상 클래스의 p.x가 호출되었다.
	p.method(); // 오버라이딩된 메서드가 호출된다
	
	System.out.println("c.x = "+c.x); 
	c.method();

	}

}
class Parent4{
	int x = 100;
	void method() {
		System.out.println("Parent2 method");
	}
}
class Child4 extends Parent4{
	int x = 200;
	void method() {
		System.out.println("x="+x); // this.x와 같다.
		System.out.println("super.x = "+super.x);
		System.out.println("this.x="+this.x);
	}
}
