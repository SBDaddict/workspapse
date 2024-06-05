package ch7;

public class Ch_7_26_RepairableTest {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Dropship2 dropship = new Dropship2();
		
		Marine2 marine = new Marine2();
		SCV scv = new SCV();
		scv.repair(tank); // Tank 수리
		scv.repair(dropship); // Dropship 수리
		// scv.repair(marine); // 에러 발생: Marine은 Repairable을 구현하지 않음
	}
}

// 서로 관계가 없는 클래스끼리 묶어주기 위한 인터페이스
interface Repairable {}

class Unit4 {
	int hitPoint; // 유닛의 현재 체력
	final int MAX_HP; // 유닛의 최대 체력

	Unit4(int hp) { // 생성자에서 초기화
		MAX_HP = hp;
	}
}

// 지상 유닛을 나타내는 클래스
class GroundUnit extends Unit4 {
	GroundUnit(int hp) {
		super(hp);
	}
}

// 공중 유닛을 나타내는 클래스
class AirUnit extends Unit4 {
	AirUnit(int hp) {
		super(hp);
	}
}

// 탱크 클래스, 지상 유닛이면서 수리 가능
class Tank2 extends GroundUnit implements Repairable {
	Tank2() {
		super(150);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
}

// 드롭십 클래스, 공중 유닛이면서 수리 가능
class Dropship2 extends AirUnit implements Repairable {
	Dropship2() {
		super(150);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
}

// 마린 클래스, 지상 유닛이지만 수리 불가능
class Marine2 extends GroundUnit {
	Marine2() {
		super(40);
		hitPoint = MAX_HP;
	}
}

// SCV 클래스, 지상 유닛이면서 수리 가능
class SCV extends GroundUnit {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	// 수리 메서드, Repairable을 구현한 유닛만 수리 가능
	void repair(Repairable r) {
		if (r instanceof Unit4) { // 수리 가능한 유닛인지 확인
			Unit4 u = (Unit4) r;
			while (u.hitPoint < u.MAX_HP) { // 최대 체력에 도달할 때까지 수리
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}
