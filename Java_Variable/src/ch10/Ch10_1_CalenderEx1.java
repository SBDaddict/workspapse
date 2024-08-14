package ch10;

import java.util.Calendar;

public class Ch10_1_CalenderEx1 {

	public static void main(String[] args) {
		Calendar toDay = Calendar.getInstance(); //Calendar는 추상클래스라 new 연산자를 통해 인스턴스를 생성하지 못하고
		// getInstance 메서드로 인스턴스를 얻어야한다.
		
		System.out.println("이 해의 년도 : " + toDay.get(Calendar.YEAR));
		System.out.println("월(0 ~ 11 , 0 == 1월) :  " + toDay.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주 " + toDay.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 " + toDay.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇 일 " + toDay.get(Calendar.DATE));
		System.out.println("이 달의 몇 일 " + toDay.get(Calendar.DATE));
		

	}

}
