package ch5;

public class ArrayEx1_5_12 {
    public static void main(String[] args){
        String[] names = {"KIM","PARK","YI"};
        for(int i = 0 ; i < names.length;i++){
            System.out.println("names["+i+"] : "+names[i]);
        }
        String tmp = names[2];
        System.out.println("tmp :"+tmp);
        names[0] = "Yu";
        for(String str : names){
            System.out.println(str);
        }
    }//main and

}
