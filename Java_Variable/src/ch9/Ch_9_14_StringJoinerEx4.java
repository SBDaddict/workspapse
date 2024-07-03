package ch9;

import java.util.StringJoiner;

public class Ch_9_14_StringJoinerEx4 {

	public static void main(String[] args) {
	String animals = "dog,cat,bear";
	String[] arr = animals.split(",");
	
	System.out.println(String.join("-", arr));
	
	StringJoiner sJ = new StringJoiner("/","[","]");
	for(String s: arr)
		sJ.add(s);
		System.out.println(sJ.toString());

	}

}
