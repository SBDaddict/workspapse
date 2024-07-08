package ch9;

public class Ch_9_19_StringBufferEx2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(56);
  
		sb.append('4').append(56); // append() 가StringBuffer를 반환하여 이어서 같은 메서드를 호출하는게 가능
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		System.out.println("sb = "+sb);
		System.out.println("sb2 = "+sb);
		System.out.println("sb3 = "+sb);
		System.out.println("sb = "+sb.deleteCharAt(10)); // 인덱스 10번째 문자를 지운다. 그래서 0156456789.0 중 .이 지워짐
		System.out.println("sb = "+sb.delete(3,6)); // 인덱스 3번째 부터 6번째 까지 지운다. 마지막 6은 포함이 안되어 인덱3,4,5 까지 지워짐
		System.out.println("sb = "+sb.insert(3,"abc")); // 인덱스 3번째에 "abc"를 넣는다.67890는 뒤로 밀림
		System.out.println("sb = "+sb.replace(6, sb.length(), "END")); //지정된 범위의 문자들을 주어진 문자열로 바꾼다. sb.length()가 11이므로 6~11 까지 범위의 문자를 바꾼다. 11은 포함 안됨.
		System.out.println("capacity="+sb.capacity()); // sb배열의 인덱스 전체길이
 		System.out.println("length="+sb.length()); //sb배열의 저장된 길이
		
		

	}

}
