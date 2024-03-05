package ch2;

public class Ch2_8 {
    public static void main(String[] args) {

        char ch = 'A';
        System.out.println(ch);
        int i = ch; // int type 의 변수에 문자형을 넣으면 유니코드로 나온다
        System.out.println(i);

        String str = "";
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;
        System.out.println(str4);
        System.out.println(""+7+7);
        System.out.println(7+7+"");
    }
}
