package ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch_9_33_RegularEx3 {
	public static void main(String[] args) {
		String source = "HP:011-1111-1111, HOME : 02-000-0000";
		String pattren = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p = Pattern.compile(pattren);
		Matcher m = p.matcher(source);
		
		int i = 0;
		
		while(m.find()) {
			System.out.println(++i + " : " + m.group() + " -> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
		}
	}

}
