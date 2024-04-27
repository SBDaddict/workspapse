package ch6;
class Ch_6_20_MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv; // 인스턴스 변수는 cv를 언제나 사용가능
    //static int cv2 = iv; 에러 클래스 변수는 인스턴스 변수를 사용하려면 먼저 객체를 생성해야한다.
    static int cv2 = new Ch_6_20_MemberCall().iv; // 이처럼 객체를 생성해야 사용가능하다.

    static void staticMethod1(){
        System.out.println(cv);
//        System.out.println(iv); 에러 클래스메서드에서 인스턴스 변수 사용불가능
        Ch_6_20_MemberCall c = new Ch_6_20_MemberCall();
        System.out.println(c.iv); //  객체를 생성후 사용가능해졌다.
    }
    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);// 인스턴스 메서드 에서는 인스턴스 변수를 바로 사용가능.
    }
    static void staticMethod2(){
        staticMethod1();
//        instanceMethod1(); 에러 객체를 생성하지 않고서 사용할 수 없다.
        Ch_6_20_MemberCall c = new Ch_6_20_MemberCall();
        c.instanceMethod1(); //  객체를 생성후 사용가능
    }
    void instanceMethod2(){
        staticMethod1();
        instanceMethod1();// 모두 인스턴스 생성없이 바로 호출이 가능하다
    }
}