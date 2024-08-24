package ch10;

import java.text.MessageFormat;

public class Ch_10_18_MessageFormatEx1 {

	public static void main(String[] args) {
		String msg = "Name: {0} \nTel: {1} \nAge: {2}\nBirtday: {3}";
		
		Object[] arguments = {"이자바", " 02-123-1234", "27", "07-09"};
		
		String result = MessageFormat.format(msg, arguments);
		
		System.out.println(result);

	}

}
