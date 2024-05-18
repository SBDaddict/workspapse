package practiceExercises;

class SutdaCard {
	boolean isKwang = false;
	private int num = 0;
	String kwang = " ";
	SutdaCard(){}
	public void setNum(int num){
		if(num <= 0 || num <=10) {
		this.num = num;
		}
	}
	public int getNum() {
return num;	}
	boolean kwang() {

		if (kwang.equals("광"))
			return isKwang = true;
			return false;
	}
}

public class Ch_6_1_SutdaCard {

	public static void main(String[] args) {
		SutdaCard s = new SutdaCard();
		s.setNum(9);
		System.out.println(s.getNum());
		
	}
	

}
