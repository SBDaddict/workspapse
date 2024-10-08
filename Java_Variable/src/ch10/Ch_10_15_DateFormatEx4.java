package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ch_10_15_DateFormatEx4 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해 주세요. (입력예: 2015/12/31)");
		
		while(s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 입력해 주세요. (입력예: 2015/12/31)");
				
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar toDay = Calendar.getInstance();
		
		long day = (cal.getTimeInMillis() - toDay.getTimeInMillis()) / (60*60*1000);
		
		System.out.println("입력하신 날짜는 현재와 " + day + "만큼 시간차이가 있습니다.");
		

	}

}
