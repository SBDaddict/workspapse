package ch7;
import java.util.*; // Vector클래스를 사용하기 위해 추
class Product {
	Product() {
	};

	int price; // 제품가격
	int bonusPoint; // 제품구매시 제공하는 보너스 점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%;
	}

} // and Product

class Tv2 extends Product {
	Tv2() {
		// 조상클래스의 생성자 product(int price)를 호출한다.
		super(100); // tv2의 가격을 100으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "tv";
	}
} // and Tv2

class Computer extends Product {
	Computer() {
		// 조상클래스의 생성자 product(int price)를 호출한다.
		super(200); // computer의 가격을 100으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "computer";
	}
} // and computer
class Audio extends Product {
	Audio() {
		// 조상클래스의 생성자 product(int price)를 호출한다.
		super(50); // Audio의 가격을 100으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Audio";
	}
} // and computer

class Buyer { // 고객, 물건을 사는 사
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 보너스점수
//	Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
	Vector item = new Vector(); // 구매할 제품을 저장하는데 사용될 Vector
	int i = 0; //Product배열에 사용될 카운터
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); // 구입한 제품을 Vector에 저장한
		
		//System.out.println(p+ "을/를 구매하였습니다."); 문자열과 +연산자를 출력하면
		//System.out.println(p.toString + "을/를 구매하였습니다."); 을 호출한 것과 같다.
		// 매개변수에 Tv 클래스의 아규먼트가 들어오면 tv멤버 public String toString() { return "tv";} 가 호출된다.
		System.out.println(p + "을/를 구매하였습니다.");
	}
	void refund(Product p) {
		if(item.remove(p)) { //제품을 Vector에서 제거한
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하였습니다");
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	void summary() {
		int sum = 0;
		String itemList ="";
		if(item.isEmpty()) { // Vector가 비어있는지 확인한다.
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i = 0 ; i < item.size() ; i++) {
			Product p = (Product)item.get(i); //Vector에 i번째 있는 객체를 얻어온다
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총금액은" + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class Ch_7_21_PolyArgumentTest {
	public static void main(String[] args) {
	Buyer b = new Buyer();
	Tv2 tv = new Tv2();
	Computer com = new Computer();
	Audio audio = new Audio();
	
	
	b.buy(tv);
	b.buy(com);
	b.buy(audio);
	b.summary();
	System.out.println();
	b.refund(com);
	b.summary();
	

	}

}
