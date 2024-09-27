package ch11;

import java.util.*;

public class Ch_11_20_HashSetLotto {

	public static void main(String[] args) {
		Set hs = new HashSet();
		
		for(int i = 0 ; hs.size() < 6 ; i++) {
			int num = (int)(Math.random()*45)+1;
			
			hs.add(new Integer(num));
		}
		
		List ls = new LinkedList(hs);
		Collections.sort(ls);
		System.out.println(ls);
		
	}

}
