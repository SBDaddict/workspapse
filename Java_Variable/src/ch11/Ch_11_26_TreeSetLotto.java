package ch11;

import java.util.*;

public class Ch_11_26_TreeSetLotto {

	public static void main(String[] args) {
		Set ts = new TreeSet();

		for (int i = 0; ts.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;

			ts.add(num);
		}

		System.out.println(ts);

	}

}
