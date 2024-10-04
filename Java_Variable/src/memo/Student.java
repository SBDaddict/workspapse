package memo;

public class Student {
	String name = " ";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		float aver =  (kor + eng + math) / 3.0f;
		return Math.round(aver*10) / 10.f;
	}
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		int sum = getTotal();
		float aver = getAverage();
		
		return name + ","+ ban +", "+ sum; 
	}
}
