package ch7;

public class Ch_7_24_FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		if(f instanceof Unit1) {
			System.out.println("f 는 Unit1 의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f 는 Fightable인터페이스를 구현했습니다.");
		}
		if(f instanceof Movable) {
			System.out.println("f 는 Movable인터페이스를 구현했습니다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f 는 Attackable인터페이스를 구현했습니다.");
		}
		if(f instanceof Object) {
			System.out.println("f 는 Object 의 자손입니다.");
		}

	}

}
class Fighter extends Unit1 implements Fightable{
	public void move(int x, int y) {/*내용생략*/}
	public void attack(Unit1 u) {/*내용생략*/}
}

class Unit1{
	int currentHP;
	int x;
	int y;
}
interface Fightable extends Movable, Attackable {}
interface Movable { void move(int x, int y);}
interface Attackable {void attack(Unit1 u);}
