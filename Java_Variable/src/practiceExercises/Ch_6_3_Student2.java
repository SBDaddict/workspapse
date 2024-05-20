package practiceExercises;

public class Ch_6_3_Student2 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동",1,1,100,60,76);
	System.out.println(s.info());
	}
}

class Student2 {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student2() {
	}

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int setTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}

	float setAverage() {
		float average = (float)(setTotal() / 3.0);
		return Math.round(average * 10) / 10.0f;
	}
	
	public String info() {
		return this.name 
			+ ","
			+ this.ban
			+ "," 
			+ this.no 
			+ "," 
			+ this.kor 
			+ "," 
			+ this.eng 
			+ "," 
			+ this.math;
	}
}
