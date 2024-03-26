package ch3;

public class OperationEx2_3_15 {
    public static void main(String[] args){
       char lowerCase = 'a';
        char upperCase = (char)(lowerCase-32); // 대문자 'A'가 소문자보다 32가 적으므로
        // 32를 빼주면 대문자 A가 된다. 그대로 넣으면 int형으로 계산되니 (형변화)을 해주자
        System.out.println(upperCase);
    }
}
