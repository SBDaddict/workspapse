package ch6;

public class Ch6 {
    public static void main(String[] args) {
        boolean power = true;
        System.out.println(power);

        byte b = 127; // -128 ~ 127

        int oct = 010; // 8진수, 10진수로는 8
        int hex = 0x10;// 16진수, 10 진수로는 16

        long l = 10_000_000_000L;

        float f = 3.14f;
        double d = 3.14f; // 변수의 접미사가 일치 하지않지만 저장가능한 값보다 작기때문에 에러가 나지않는다


        System.out.println(oct);
        System.out.println(hex);
        System.out.println(l);
        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3); // e는 1의 3승이라는 뜻
    }
}
