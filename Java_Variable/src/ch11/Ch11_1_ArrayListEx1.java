package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ch11_1_ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5)); // 객체를 저장가능하니 int가 아닌 Integer로 저장해야한다. 그냥 5를 넣어도
		// 오토박싱되어 Integer로 저장됨.
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		print(list1, list2);
		
		Collections.sort(list1); // list1 과 list2를 정렬한다
		Collections.sort(list2); // Collections.sort(list1)
		
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : "+
														list1.containsAll(list2));
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);
		list2.set(3, "AA");
		print(list1, list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 삭제한다. 교집합
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		//list2 에서 list1에 포함된 객체를 삭제한다.
		for(int i = list2.size()-1 ; i >= 0 ; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);
		
		
		
		

		
		
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 :" + list1);
		System.out.println("list2 :" + list2);
		System.out.println();
	}

}
