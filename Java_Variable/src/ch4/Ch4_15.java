package ch4;

public class Ch4_15 {
    public static void main(String[] args){
        for(int i = 2 ; i <= 9 ; i++){
            for(int j = 1 ; j <= 9 ; j++){
                System.out.print(i+"*"+j+"="+(j*i));
                System.out.println();
            }
        }
    //이걸 2중for문으로 바꾸기
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println();

        //2중 for문
        for(int j = 1 ; j <=5 ; j++){
            for(int g = 1 ; g <= 10 ; g++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
