package ch3;

public class OperationEx2_3_23 {
    public static void main(String[] args){
       String str1 = "abc";
       String str2 = new String("abc");

       System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
       System.out.printf("str1==\"abc\" ? %b%n", str1 == "abc");
       System.out.printf("str2==\"abc\" ? %b%n", str2 == "abc");
       System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
       System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
       System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
        //"abc"=="abc" ? true
        //str1=="abc" ? true
        //str2=="abc" ? false 내용은 같지만 다른 객체의 주소를 갖고있기 때문에 false가 나온다.
        //str1.equals("abc") ? true
        //str2.equals("ABC") ? false 대문자 소문자를 구분한다.
        //str2.equalsIgnoreCase("ABC") ? true 대소문자를 구분하지 않고 싶으면 사용한다.

    }
}
