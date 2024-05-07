package ch7;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ch_7_10_ImportTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘날짜는 "+date.format(today));
		System.out.println("오늘시간은 "+time.format(today));

	}

}
