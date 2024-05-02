package ch6;
public class Ch_6_27_BlockTest {
    static {
        System.out.println("static{ }");
    }
    {
        System.out.println("{ }");
    }
    public Ch_6_27_BlockTest(){
        System.out.println("생산자");
    }
    public static void main(String[] args){
        System.out.println("BlockTest bt = new BlockTest(); ");
        Ch_6_27_BlockTest bt = new Ch_6_27_BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        Ch_6_27_BlockTest bt2 = new Ch_6_27_BlockTest();
    }
}
