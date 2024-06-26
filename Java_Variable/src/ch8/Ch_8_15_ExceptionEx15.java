package ch8;

import java.io.*;

public class Ch_8_15_ExceptionEx15 {

	public static void main(String[] args) {
		//command line에서 받은값을 이름으로 갖는 파일을 생성한다.
		File f = createFile(args[0]);
	System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		

	}
	static File createFile(String fileName) {
		try{
			if(fileName == null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않음");
				}catch (Exception e) {
					// fileName이 부적절한 경우, 파일이름을 제목없음으로한다.
					fileName = "제목없음.txt";
				} finally {
					File f = new File(fileName);
				createNewFile(f);
				return f;
				}
	}
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
		}
	}

}
