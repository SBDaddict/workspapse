package ch10;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ch_10_12_DateFormatEx1 {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat sbf1,sbf2,sbf3,sbf4;
		SimpleDateFormat sbf5,sbf6,sbf7,sbf8,sbf9;
		
		sbf1 = new SimpleDateFormat("yyyy-MM-dd");
		sbf2 = new SimpleDateFormat("''yy-MMM dd일 E요일");
		
		System.out.println(sbf1.format(today));
		
		
		

	}

}

