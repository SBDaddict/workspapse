package ch11;

import java.util.*;

public class Ch_11_30_HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password을 입력해주세요");
			System.out.print("id : ");
			String id = scanner.nextLine().trim();
			System.out.print("password : ");
			String password = scanner.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다." + "다시 입력해주세요");
				continue;
			}

			if (!map.get(id).equals(password)) {
				System.out.println("password가 일치하지 않습니다. 다시 입력해주세요");
			} else {
				System.out.println("id와 password가 일치합니다");

				break;
			}
		}

	}

}
