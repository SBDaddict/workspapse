package ch8;

public class Ch_8_14_ExceptionEx14 {

	public static void main(String[] args){
		try {
			method1();			
		} catch (Exception e) {
			System.out.println("main method에서 예외가 처리됨.");
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception{
		
		throw new Exception();
	}

}
