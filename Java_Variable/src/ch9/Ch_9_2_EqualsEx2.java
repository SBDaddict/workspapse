package ch9;

public class Ch_9_2_EqualsEx2 {
	public static void main(String[] args) {
		Value2 v1 = new Value2(10);
		Value2 v2 = new Value2(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1 과 v2는 같습니다.");
		}else {
			System.out.println("v1 과 v2는 다릅니다.");
		}
		
		v2 = v1;
		
		if(v1.equals(v2)) {
			System.out.println("v1 과 v2는 같습니다.");
		}else {
			System.out.println("v1 과 v2는 다릅니다.");
		} // 객체의 주소값으로 비교하기 때문에 위에서는 다릅니다가 나오지만,v2의 주소값을 v1의 주소값으로 넣었기 때문에
		// true를 얻었다.
		
		
	}

}
class Value2 {
	int value2;
	Value2(int value){this.value2 = value;}
	public boolean equals(Object obj) {
		if(obj instanceof Value2) {
			return value2 == ((Value2)obj).value2;
		}else {
			return false;
		}
	}
}
