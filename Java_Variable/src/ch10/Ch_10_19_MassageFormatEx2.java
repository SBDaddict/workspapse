package ch10;

import java.text.MessageFormat;

public class Ch_10_19_MassageFormatEx2 {

	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',''{2}'',''{3}'')";
		
		Object[][] arguments = {
				{"이자바","010-000-123","27","07-09"},
				{"자바","010-111-123","33","10-02"},
		};

		for(int i = 0; i < arguments.length ;i++) {
			String result = MessageFormat.format(msg,arguments[i]);
			System.out.println(result);
		}
	}

}
