package ch11;

import java.util.Properties;

public class Ch_11_38_PropertiesEx4 {

	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		System.out.println("java.version : "+ sysProp.getProperty("java.version"));
		System.out.println("user.lenguage : "+ sysProp.getProperty("user.lenguage"));

		sysProp.list(System.out);
	}

}