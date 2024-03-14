package ch4;

public class Ch4_13 {
public static void main(String[] args){

    for(int i = 1 ; i <= 3 ; i++){
        System.out.println("Hello");
        }

    for(int i = 1 ; i <= 10 ; i = i+2){// 1,3,5,7,9
        System.out.println(i);
        }
    for(int i = 1 ; i <= 10 ; i = i*2){// 1,2,4,8
        System.out.println(i);
    }
    for(int i = 1, j = 10 ; i <= 10 ; i++, j--){// i = 1~10, j=10~1
        System.out.println("i="+i+", j="+j);
    }//변수 2개를 초기화 할 수 있다. 같은 type끼리만 가능
    // for문안에 변수는 밖에서는 사용할 수 없다.
    // 사용하려면 for문 밖에 변수를 초기화하면 사용할 수 있다.
    // 변수의 scope(범위)는 좁게하는것이 좋다. scope가 넚으면 변수 오류를 찾는데도 어렵기 때문에

    int sum = 0; //  합계를 저장하기 위한 변수
    for(int i = 0 ; i <= 4 ; i++){
        sum += 1; //  sum = sum + i;
        System.out.printf("1부터 %1d 까지의 합 : %1d%n", i,sum);
    }

    }
}
