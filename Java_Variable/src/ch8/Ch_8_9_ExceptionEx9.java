package ch8;

public class Ch_8_9_ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 메세지 : "+e.getMessage());
			System.out.println("프로그램이 정상종료 되었음");
		}
	}
}
