package ch4;

public class Ch4_21 {
    public static void main(String[] args){
        for(int i = 0; i <= 10; i++){

            if(i % 3 == 0)
                continue; // 조건식이 true이면 continue문이 실행되어 불럭의 끝으로 이동한다
            // break문과 달리 반복문을 벗어나지 않는다.
            System.out.println("i = "+i);//continue문이 실행되면 건너뛴다.
        }
        /*
        i = 1
        i = 2
        i = 4
        i = 5
        i = 7
        i = 8
        i = 1
        0*/
    } //main and
}
