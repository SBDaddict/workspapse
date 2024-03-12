package cescoIncentive;
import java.util.Scanner;

public class CescoIncentive {
    public static void main(String[] args){
        final double TIME_1 = 0.58;
        final double TIME_2 = 0.33;
        final double TIME_3 = 0.25;
        final double TIME_4 = 0.17;
        int js = 1;

        int uvPowerAs = 0;
        int roomCaerAs = 0;
        int sensmeAs = 0;
        int roomAirFilterAs = 0;
        int duerAs = 0;
        int maxPowerAs = 0;
        int miniAs = 0;
        int bidetAs = 0;
        int stendWorterAs = 0;
        int airJanicAs = 0;
        int airPurpumAs = 0;
        int waterPurifierAs = 0;
        int tankWaterPurifierAs = 0;
        int freshGenicAs = 0;
        int handSanitizerAs = 0;

        int uvPower = 0;
        int sensme = 0;
        int roomAirFilter = 0;
        int duer = 0;
        int roomCaer = 0;
        int maxPower = 0;
        int mini = 0;
        int bidet = 0;
        int stendWorter = 0;
        int airJanic = 0;
        int airPurpum = 0;
        int waterPurifier = 0;
        int tankWaterPurifier = 0;
        int freshGenic = 0;
        int handSanitizer = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("센스미as 개수는? : ");
        sensmeAs = scanner.nextInt();
        System.out.println("거실형_공기청정기as 개수는? : ");
        roomAirFilterAs = scanner.nextInt();
        System.out.println("듀얼케어 공청기as 개수는? : ");
        duerAs = scanner.nextInt();
        System.out.println("룸케어 공청기as 개수는? : ");
        roomCaerAs = scanner.nextInt();
        System.out.println("에어제닉as 개수는? : ");
        airJanicAs = scanner.nextInt();
        System.out.println("에어퍼퓸as 개수는? : ");
        airPurpumAs = scanner.nextInt();
        System.out.println("직수정수기as 개수는? : ");
        waterPurifierAs = scanner.nextInt();
        System.out.println("프레쉬제닉as 개수는? : ");
        freshGenicAs = scanner.nextInt();
        System.out.println("핸드/세니제닉as 개수는? : ");
        handSanitizerAs = scanner.nextInt();

        System.out.println("유파공 설치,철거 개수는? : ");
        uvPower = scanner.nextInt();
        System.out.println("센스미 설치,철거 개수는? : ");
        sensme = scanner.nextInt();
        System.out.println("거실형_공기청정기 설치,철거 개수는? : ");
        roomAirFilter = scanner.nextInt();
        System.out.println("듀얼케어 공청기 설치,철거 개수는? : ");
        duer = scanner.nextInt();
        System.out.println("룸케어 공청기 설치,철거 개수는? : ");
        roomCaer = scanner.nextInt();
        System.out.println("맥스파워 공청기 설치,철거 개수는? : ");
        maxPower = scanner.nextInt();
        System.out.println("비데 설치,철거 개수는? : ");
        bidet = scanner.nextInt();
        System.out.println("에어제닉 설치,철거 개수는? : ");
        airJanic = scanner.nextInt();
        System.out.println("에어퍼퓸 설치,철거 개수는? : ");
        airPurpum = scanner.nextInt();
        System.out.println("직수정수기 설치,철거 개수는? : ");
        waterPurifier = scanner.nextInt();
        System.out.println("프레쉬제닉 설치,철거 개수는? : ");
        freshGenic = scanner.nextInt();
        System.out.println("핸드/세니제닉 설치,철거 개수는? : ");
        handSanitizer = scanner.nextInt();

        int asTime1Sum = 0;
        asTime1Sum = uvPowerAs + sensmeAs + roomAirFilterAs + duerAs + roomCaerAs + maxPowerAs;
        int asTime2Sum = 0;
        asTime2Sum = miniAs + bidetAs + stendWorterAs + waterPurifierAs + tankWaterPurifierAs;
        int asTime3Sum = 0;
        asTime3Sum = airPurpumAs;
        int asTime4Sum = 0;
        asTime4Sum = airJanicAs + freshGenicAs + handSanitizerAs;

        int time1Sum = 0;
        time1Sum = uvPower + roomCaer + duer + roomAirFilter + maxPower;
        int jsSum = 0;
        jsSum = mini + stendWorter + waterPurifier + tankWaterPurifier;
        int time2Sum = 0;
        time2Sum = bidet + freshGenic;
        int time3Sum = 0;
        time3Sum = airJanic + airPurpum + handSanitizer;

        System.out.println(jsSum);
        double time1 = TIME_1 * (asTime1Sum + time1Sum);
        System.out.println(time1);
        double time2 = TIME_2 * (asTime2Sum + time2Sum);
        System.out.println(time2);
        double time3 = TIME_3 * (asTime3Sum + time3Sum);
        System.out.println(time3);
        double time4 = TIME_4 * asTime4Sum;
        System.out.println(time4);
        double total = jsSum + time1 + time2 + time3 + time4;
        System.out.println(total);

        if(total < 56) {
            System.out.println("아쉽지만 이번달은 인센없음...");
        }else if(total <= 62) {
            System.out.println("350,000원");
        } else if (total <= 63) {
            System.out.println("400,000원");
        } else if (total >= 70) {
            System.out.println("500,000원");
        }

    }
}
