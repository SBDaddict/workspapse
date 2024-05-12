package ch7;

public class Ch_7_15_CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		// car = (Car)fe를 형변환 생략을 하였다.
//		car.water; Car멤버에 water()가 없어서 오류
		fe2 = (FireEngine)car;
		fe2.water();

	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr");
	}
	void stop() {
		System.out.println("stop");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!");
	}
}
