package ch7;

public class ch_7_29_InterfaceTest3 {

	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}

}

class A{
	void methodA() {
		I i = InterfaceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
	
}

interface I {
	public abstract void methodB();
}

class B implements I {
	public void methodB() {
		System.out.println("methodB in B class");
	}
	
	public String toString() {return "class B";}
}

class InterfaceManager {
	public static I getInstance() {
		return new B(); // 반환타입이 인터페이스라는 것은 인터페이스를 구현한 인스턴스를 반환해야 한다는 뜻이다.
		
	}
}
