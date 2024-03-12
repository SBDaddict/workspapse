package memo;

public class Random {
    public static void main(String[] args){
        // 난수 1~5까지 만들어라
        // -5 ~ 10 까지 만들기

        for(int i=1; i<=5; i++){
           //System.out.println((int)(Math.random()*5)+1);
            System.out.println((int)(Math.random()*16)-5);
        }
    }

}
