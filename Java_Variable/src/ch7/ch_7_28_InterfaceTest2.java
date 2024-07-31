package ch7;

interface In {
	public abstract void play();
}

class B1 implements In {
	public void play() {
		System.out.println("play in B1 class");
	}
}

class C1 implements In {
	public void play() {
		System.out.println("play in C1 class");
	}
}

class A1 {
	void autoPlay(In i) {
		i.play();
	}
}

public class ch_7_28_InterfaceTest2 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.autoPlay(new B1());
		a.autoPlay(new C1());
	}

}
