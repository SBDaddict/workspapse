package ch6;
class Product{ // Product클래
	
	static int count = 0;
	int serialNo;
	
	{// 인스턴스 초기화
		++count;
		serialNo = count;
	}
	public Product() {}; // 기본 생성자 생략 가능.

}
class Ch_6_29_ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호는 (serial no)는"+p1.serialNo);
		System.out.println("p1의 제품번호는 (serial no)는"+p2.serialNo);
		System.out.println("p1의 제품번호는 (serial no)는"+p3.serialNo);
		System.out.println("생산된 제품의 수는 : "+Product.count+"입니다.");
		
		
	}
	
}
