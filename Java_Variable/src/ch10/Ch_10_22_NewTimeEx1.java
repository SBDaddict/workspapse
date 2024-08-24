package ch10;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ch_10_22_NewTimeEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();//오늘 날짜
		LocalTime now = LocalTime.now();//현재 시간
		
		LocalDate birthDay = LocalDate.of(1994,12,31);// 1999년 12월 31일
		LocalTime birthTime = LocalTime.of(23,59,59);//23시59분59초
		
		System.out.println(today+ " = today");
		System.out.println(now+ " = now");
		System.out.println(birthDay+ " = birthDay");
		System.out.println(birthTime+ " = birthTime");
		
		System.out.println(birthDay.withYear(2000));
		System.out.println(birthDay.plusDays(1));
		System.out.println(birthDay.plus(1,ChronoUnit.DAYS));
		
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));
		
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
		System.out.println(ChronoField.HOUR_OF_DAY.range());
		
	}

}
