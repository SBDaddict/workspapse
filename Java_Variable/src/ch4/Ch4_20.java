package ch4;

public class Ch4_20 {
    public static void main(String[] args){
        int sum = 0;
        int i = 0;

        while (true){     //무한반복문 : while문은 true를 붙여주면 되고 for문은
            // for(;;) || for(;true;) 두가지 방법이 있다.
        if(sum > 100)
            break;// 자신이 속한 하나의 반복문을 벗어난다. 세미콜론은 if와 함께 묶어서
            ++i;
        sum += i;
        }
        System.out.println("i="+i);
        System.out.println("sum="+sum);

    }
}
