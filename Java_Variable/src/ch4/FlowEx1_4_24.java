package ch4;

public class FlowEx1_4_24 {
    public static void main(String[] args){
       System.out.println("카운트다운");
       int i = 11;

       while (i-- !=0){
           System.out.println(i);
           for(int j = 0 ; j <= 2_000_000_000 ; j++);
       }
       System.out.println("게임오버");
         }//main and
    }

