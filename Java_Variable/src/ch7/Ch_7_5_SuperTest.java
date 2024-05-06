package ch7;

public class Ch_7_5_SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
class Parent{
	int x = 10;
}
class Child extends Parent {
	void method() {
		System.out.println("x = "+x);
		System.out.println("superx = "+super.x);
		System.out.println("this = "+this.x);
	}
}
