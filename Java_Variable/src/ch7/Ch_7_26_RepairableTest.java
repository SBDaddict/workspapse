package ch7;


public class Ch_7_26_RepairableTest {

	public static void main(String[] args) {

	}

}

interface Repairable {}; // 서로 관계가 없는 클래스끼리 묶어주기 위한 인터페이스
class Unit3 {
	int hitPoint;
	final int MAX_HP;
	Unit3(int hp){ // 생성자에서 초기화
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit3 {
	GroundUnit(int hp){
		super(hp);
	}
}
// 이어서 작성

