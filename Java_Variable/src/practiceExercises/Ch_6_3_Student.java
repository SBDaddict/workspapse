package practiceExercises;

import java.math.BigDecimal;

public class Ch_6_3_Student {
	public static void main(String[] args) {
		Student s = new Student();
	s.name = "홍길동";
	s.ban = 1;
	s.no = 1;
	s.kor = 100;
	s.eng = 60;
	s.math = 76;
	System.out.println("이름 : "+s.name);
	System.out.println("총점 : "+s.setTotal());
	System.out.println("평균 : "+s.setAverage());
	}
}

class Student {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int setTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}

	float setAverage() {
		float average = (float)(setTotal() / 3.0);
		return Math.round(average * 10) / 10.0f;
	}

}
