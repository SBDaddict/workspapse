package ch8;

public class ch_8_19_FinallyTest3 {

	public static void main(String[] args) {
		ch_8_19_FinallyTest3.method1();
		System.out.println("method1의 수행을 마치고 돌아옴.");
	}

	static void method1() {
		try {
			System.out.println("method1이 호출 되었습니다.");
			return;// 현재 실행중인 메서드를 종료시킨다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1 () finally블럭이 실행");
		}

	}
}
