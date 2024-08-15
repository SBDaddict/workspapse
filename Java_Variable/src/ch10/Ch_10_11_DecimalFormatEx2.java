package ch10;

import java.text.DecimalFormat;

public class Ch_10_11_DecimalFormatEx2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");
			System.out.print("1,234,567.89" + "->");
			
			double d = num.doubleValue();
			System.out.print(d+ " -> ");
			
			System.out.println(df2.format(num));
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
