    package ch5;

    public class Ch5_13 {
        public static void main(String[] args){

            String[] strArr ={"가위","바위","보"}; // String type 배열 선언

            for(int i = 0 ; i < 10 ; i++){
                int r = (int)(Math.random() * 3);
                System.out.println(strArr[r]);
            }

        }
    }
