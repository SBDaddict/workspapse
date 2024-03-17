package memo;

import java.util.Arrays;
import java.util.Scanner;

public class MedianFinder2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] nums = new long[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("num%d에 들어갈 정수를 입력하세요: ", i + 1);
            nums[i] = scanner.nextLong();
        }

        Arrays.sort(nums);
        long median = nums[1];
        System.out.printf("중간값은 %d입니다.", median);
    }
}
