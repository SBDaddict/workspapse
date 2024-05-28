package ch7;

public class Ch_7_22 {

	public static void main(String[] args) {
//		Unit[] u = new Unit[3];
//		u[0] = new Marine();
//		u[1] = new Tank();
//		u[2] = new Dropship();
		Unit[] u = {new Marine(), new Tank(), new Dropship() };
		for(int i = 0 ; i < u.length ; i++) {
			u[i].move(100,200);
		}
		Tank t = null;
		t = (Tank)u[1];
		t.changeMode();

	}
}

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() { /*현재 위치에 정지*/}
	
}
class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y="+y+"]");
	}
	void stimPack() {/*스팀팩을 사용한다.*/}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y="+y+"]");
	}
	void changeMode() {/*공격모드로 변환한다.*/}
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y="+y+"]");
	}
	void load() {/*대상을 태운다.*/}
	void unload() {/*대상을 내린다.*/}
}