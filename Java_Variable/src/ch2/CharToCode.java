package ch2;

public class CharToCode {
    public static void main(String[] args){
        char ch = 'A'; // char ch = '65';유니코드로 65는 A라는 뜻이다
        int code = (int)ch;// ch 에 저장된 값을 int형변환 하여 code애 저장한다
        System.out.printf("%c=%d(%#X)%n",ch, code, code);//%c는 char type 문자로 출력한다는 뜻이고
        //%d 는 10진 정수형식으로 출력, %#X 16진수로 표현하는 코드
        char hch = '가';
        System.out.printf("%c=%d(%#X) %n",hch, (int)hch,(int)hch);

    }
}
