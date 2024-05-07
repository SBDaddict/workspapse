package ch7;

public class Ch_7_8_PointTest2 {
	public static void main(String[] arhs) {
		Point3D2 p = new Point3D2();
		System.out.println("p3.x="+p.x);
		System.out.println("p3.y="+p.y);
		System.out.println("p3.z="+p.z);
		
	}

}

class Point2 {
	int x = 10;
	int y = 20;
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Point3D2 extends Point2{
	int z = 30;
	
	Point3D2(){
		this(100,200,300);
	}
	Point3D2(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
}
