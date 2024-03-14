package cescoIncentive;

import java.util.Scanner;

public class CescoIncentive2 {
    public static void main(String[] args) {
        final int[] TIME = {35, 20, 15, 10};
        final String[] AS_PROMPTS = {
                "센스미as 개수는? : ",
                "거실형_공기청정기as 개수는? : ",
                "듀얼케어 공청기as 개수는? : ",
                "룸케어 공청기as 개수는? : ",
                "에어제닉as 개수는? : ",
                "에어퍼퓸as 개수는? : ",
                "직수정수기as 개수는? : ",
                "프레쉬제닉as 개수는? : ",
                "핸드/세니제닉as 개수는? : "
        };
        final String[] INSTALLATION_PROMPTS = {
                "유파공 설치,철거 개수는? : ",
                "센스미 설치,철거 개수는? : ",
                "거실형_공기청정기 설치,철거 개수는? : ",
                "듀얼케어 공청기 설치,철거 개수는? : ",
                "룸케어 공청기 설치,철거 개수는? : ",
                "맥스파워 공청기 설치,철거 개수는? : ",
                "비데 설치,철거 개수는? : ",
                "에어제닉 설치,철거 개수는? : ",
                "에어퍼퓸 설치,철거 개수는? : ",
                "직수정수기 설치,철거 개수는? : ",
                "프레쉬제닉 설치,철거 개수는? : ",
                "핸드/세니제닉 설치,철거 개수는? : "
        };

        Scanner scanner = new Scanner(System.in);

        int[] asCounts = new int[AS_PROMPTS.length];
        int[] installationCounts = new int[INSTALLATION_PROMPTS.length];

        // 입력 받기
        for (int i = 0; i < AS_PROMPTS.length; i++) {
            System.out.println(AS_PROMPTS[i]);
            asCounts[i] = scanner.nextInt();
        }

        for (int i = 0; i < INSTALLATION_PROMPTS.length; i++) {
            System.out.println(INSTALLATION_PROMPTS[i]);
            installationCounts[i] = scanner.nextInt();
        }

        // 계산하기
        int jsSum = 60;
        int asTimeSum = 0;
        int timeSum = 0;

        for (int i = 0; i < 4; i++) {
            asTimeSum += asCounts[i];
            timeSum += installationCounts[i + 6]; // 설치, 철거 개수 배열 인덱스 수정
        }

        int total = jsSum + (TIME[0] * (asTimeSum + timeSum)) +
                (TIME[1] * (installationCounts[0] + installationCounts[1])) +
                (TIME[2] * (installationCounts[2] + installationCounts[3])) +
                (TIME[3] * (installationCounts[4] + installationCounts[5]));

        float totalHours = (float) total / 60;

        // 결과 출력하기
        System.out.printf("이번달은 %d분 일했고 이를 시간으로 하면 %.2f시간 입니다.\n", total, totalHours);

        if (totalHours < 56) {
            System.out.println("아쉽지만 이번달은 인센 없음...");
        } else if (totalHours <= 62) {
            System.out.println("350,000원");
        } else if (totalHours <= 63) {
            System.out.println("400,000원");
        } else if (totalHours >= 70) {
            System.out.println("500,000원");
        }
    }
}
