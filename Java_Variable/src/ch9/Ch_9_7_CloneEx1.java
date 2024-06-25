package ch9;


class Point implements Cloneable {
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public String toString() {
		return "x = " + x + ", y = "+ y;
	}
	
	public Point clone() { // 원래는 리턴타입이 Objeckt로 해야하하지만, 공변 반환타입을 사용해서 자손인Point로 사용한
		Object obj = null;
		
		try {
			obj = super.clone(); // clone() 은 반드시 예외처리해야함.
		} catch (CloneNotSupportedException e) {
		
		}
		return (Point)obj;
	}
}
public class Ch_9_7_CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = original.clone(); // 공변반환으로 하지 않으면 Point copy = (Point)original.clone(); 이렇게 형변환 해야한다.
		System.out.println(original);
		System.out.println(copy);

	}

}
