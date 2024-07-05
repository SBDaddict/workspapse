package ch9;

public class Ch_9_16_StringEx6 {

	public static void main(String[] args) {
		int iVal = 100;
		String sVal = iVal + "";
		String sVal2 = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strDval = dVal + "";
		String strDval2 = String.valueOf(dVal);
		
		double sum = Integer.valueOf("+"+sVal) // 문자열을 숫자로 바꾸는 방법
						+ Double.valueOf(strDval);
		
		System.out.println(String.join("",sVal,"+",strDval,"=")+sum);
	

	}

}
