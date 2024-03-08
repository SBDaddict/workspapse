package ch3;

public class Ch3_5 {
    public static void main(String[] args){
        int i=5,j=0;

        j = i;// 후위형
        i++;// 전에 값이 대입 후 증가
        System.out.println("j=i++; 실행 후, i = "+i+" j="+j);

        i = 5; // 결과를 비교하기 위해서 i와 j의 값을 5와0으로 변경
        j = 0;

        ++i;
        j = i; // 전위형
        System.out.println("j=++i; 실행 후, i = "+i+" j="+j);


    }
}
