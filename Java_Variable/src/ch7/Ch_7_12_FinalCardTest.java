package ch7;

class Card3{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int heigth = 250;
	Card3(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	Card3(){
		this("HEART",1);
	}
	public String toString() {
		return KIND + " " + NUMBER;
	}
}
public class Ch_7_12_FinalCardTest {

	public static void main(String[] args) {
		Card3 c = new Card3("HEART",10);
//		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		//System.out.println(c.toString()); pint()기능중 toString() 생략가
		System.out.println(c);

	}

}
