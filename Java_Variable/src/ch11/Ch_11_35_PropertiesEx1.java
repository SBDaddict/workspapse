package ch11;

import java.util.Enumeration;
import java.util.Properties;

public class Ch_11_35_PropertiesEx1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		//prop에 키와 값을 저장한다
		prop.setProperty("timeout", "30");
		prop.setProperty("languge", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
		}
		System.out.println();
		prop.setProperty("size", "20");
		System.out.println("size="+prop.getProperty("size"));
		System.out.println("capacity="+prop.getProperty("capacity","20"));
		System.out.println("loadfactor="+prop.getProperty("loadfactor","0.75"));
		
		System.out.println(prop);
		prop.list(System.out);
		
		

	}

}
