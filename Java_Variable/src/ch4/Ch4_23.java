package ch4;

public class Ch4_23 {
    public static void main(String[] args){
    loof1 : for(int i = 2 ; i <= 9 ; i++){
        for(int j = 1 ; j <= 9 ; j++){
            if(j == 5)
                break loof1;
            System.out.printf("%d * %d = %d%n",i,j, i * j);
        }
        System.out.println();
    }

    }
}
