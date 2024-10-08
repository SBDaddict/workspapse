package ch9;

class Circle implements Cloneable {
	PointExCh9 p;
	double r;

	Circle(PointExCh9 p, double r) {
		this.p = p;
		this.r = r;
	}
	
	public Circle shallowCopy() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		return (Circle)obj;
	}
	
	public Circle deepCopy() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			
		}
		Circle c = (Circle)obj;
		c.p = new PointExCh9(this.p.x, this.p.y);
		return c;
	}
	
	public String toString() {
		return "(p=" + p + ", r ="+ r +")";
	}
}

class PointExCh9 {
	int x, y;
	
	PointExCh9(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "( "+ x + ", " + y+")";
	}
}

public class Ch_9_9_ShallowDeepCopy {

	public static void main(String[] args) {
		Circle c1 = new Circle(new PointExCh9(1, 1),2.0);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		System.out.println("=c1의 변경 후="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
	}

}
