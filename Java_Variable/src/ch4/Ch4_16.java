package ch4;

public class Ch4_16 {
    public static void main(String[] args){
        int i = 5; // 반복될 횟수를 넣는다.

        while(i-- !=0){
        System.out.println(i + " - i can do it.");
        }

        int sum = 0;
        int j = 0;

        while (sum <= 100){
            System.out.printf("%d - %d%n",j,sum);
            sum += ++j;
        }

        int num = 12345, num2 = 0;

        while(num > 0){
            // 10을 나머지 계산으로 마지막 자리를 얻는다.
            num2 += num % 10;
            // 다시 num 을 10으로 나눠서 반복한다.
            num = num /10;
            System.out.printf("나머지 값은 %d, 그걸 더한 합은 %d%n",num,num2);

        }


    }
}
