package memo;


public class Solution {
    public int solution(String my_string) {
        // 공백을 기준으로 문자열을 분리
        String[] tokens = my_string.split(" ");
        
        // 첫 번째 숫자를 초기 값으로 설정
        int result = Integer.parseInt(tokens[0]);
        
        // 연산자와 숫자를 번갈아가며 처리
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int number = Integer.parseInt(tokens[i + 1]);
            
            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 테스트 케이스
        String my_string = "3 + 4";
        int result = sol.solution(my_string);
        System.out.println(result); // 7
    }
}
