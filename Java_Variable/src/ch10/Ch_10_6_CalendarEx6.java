package ch10;

import java.util.Calendar;

public class Ch_10_6_CalendarEx6 {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Usage : java calendarEx6 2024 8");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[0]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 종료일
	
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		
		//다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 된다.
		//12월 1일에서 하루를 빼면 11월30일이 된다.
		
		//첫 번째 요일이 무슨 요일인지 알아낸다.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		//eDay에 지정된 날짜를 얻어온다.
		
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("     " + args[0] + "년 " + args[1] + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i = 1 ; i < START_DAY_OF_WEEK ; i++) {
			System.out.println("   ");
		}
		
		for(int i = 1 , n =START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) {
			System.out.println((i < 10 ) ? "  "+i : " "+i);
			if(n% 7==0) System.out.println();
		
		}
		
	}
}
