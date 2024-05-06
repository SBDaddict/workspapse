package ch7;

public class Ch_7_7_PointTest {

	public static void main(String[] args) {
		MyPoint3D my = new MyPoint3D(3,4,5);
	}

}

class MyPoint{
	int x,y;
	MyPoint(){};
	MyPoint(int x, int y){ // 생성
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : "+ x +", y : " + y;
	}
}

class MyPoint3D extends MyPoint{
	int z;
	
	MyPoint3D(int x, int y, int z){
		super.x = x;
		super.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : "+ x +", y : " + y + ", z :" + z;
	}
}