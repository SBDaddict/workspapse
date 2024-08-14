package ch10;

import java.util.*;

public class Ch_10_CalenderEx2 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month인 경우 0부터 시작하기 때문에 8월인 경우 7로 지정해야 한다.
		
		date1.set(2015,7,15); // 2015월 8월 15일로 날짜를 설정한다.
		
		System.out.println("data1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		System.out.println("오늘은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다");
		
		long difference = ((date2.getTimeInMillis() - date1.getTimeInMillis())/1000);
		System.out.println("그날(date1) 부터 지금(date2)까지" + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference/(24*60*60) + "일 입니다.");
		
	}

	private static String toString(Calendar date) {
		// TODO Auto-generated method stub
		return date.get(Calendar.YEAR)+"년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE)+ "일 ";
	}

}
