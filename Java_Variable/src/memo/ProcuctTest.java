package memo;
class Product{
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	public Product() {}
}

public class ProcuctTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호는"+p1.serialNo);
		System.out.println("p1의 제품번호는"+p2.serialNo);
		System.out.println("p1의 제품번호는"+p3.serialNo);
		System.out.println("생성된 제품이 수는"+Product.count); // 
		
		
	}

}
