package ch8;

public class Ch_8_4_ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
