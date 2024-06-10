package ch8;

public class Ch_8_3_ExceptionEx3 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			try {
				result = number / (int)(Math.random()*10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0"); //ArithmeticException 가 발생하면 "0"을 출력한다.
			
			} // try - catch and
			
		}// for and

	}

}
