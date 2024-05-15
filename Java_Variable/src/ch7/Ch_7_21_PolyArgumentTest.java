package ch7;

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

class computer extends Product {
	computer() {
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
	Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; //Product배열에 사용될 카운터
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		
		//System.out.println(p+ "을/를 구매하였습니다."); 문자열과 +연산자를 출력하면
		//System.out.println(p.toString + "을/를 구매하였습니다."); 을 호출한 것과 같다.
		// 매개변수에 Tv 클래스의 아규먼트가 들어오면 tv멤버 public String toString() { return "tv";} 가 호출된다.
		System.out.println(p + "을/를 구매하였습니다.");
	}
	void summary() {
		int sum = 0;
		String itemList ="";
		
		for(int i = 0 ; i < item.length ; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은" + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class Ch_7_21_PolyArgumentTest {
	public static void main(String[] args) {
	Buyer b = new Buyer();
	
	b.buy(new Tv2());
	b.buy(new computer());
	b.buy(new Audio());
	b.summary();

	}

}
