package ch7;
final class Singleton{
	private static Singleton s = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton();
		return s;
	
	}
	
}

class Ch_7_14_SingletonTest {
	public static void main(String[] args) {
//		Singleton n = new Singleton(); //생성자가 보이지 않는다는 에러가 난다.
		Singleton s = Singleton.getInstance();
	}

}
