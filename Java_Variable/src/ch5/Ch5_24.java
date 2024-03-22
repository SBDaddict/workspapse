package ch5;

import java.util.Arrays;

public class Ch5_24 {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4};
        int [][] arr2D = {{11,12},{21,22}};

        System.out.println(Arrays.toString(arr)); // 1차원 배열을 문자열로 출력
        //[0, 1, 2, 3, 4]
        System.out.println(Arrays.deepToString(arr2D));// 2차원 배열을 문자열로 출력
        //[[11, 12], [21, 22]]

        String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D,str2D2));//false
        // 1차원 배열은 Arrays.equals()매서드를 사용하면 되지만, 해당 배열을 2차원 배열이라
        // false가 출력된다.
        System.out.println(Arrays.deepEquals(str2D,str2D2));//true
        // 그러므로 다차원 배열은 Arrays.deepEquals 라는 매서드를 사용해야 한다.
        // 실행해보면 true가 정상적으로 출력된다.

        //Arrays.copyOf,Arrays.copyOfRange 배열을 for문을
        // 이용하지 않고 복사할 수 있는 매서드
        int[] copy = {0,1,2,3,4};
        int[] copy1 = Arrays.copyOf(copy, copy.length);
        // copy.length는 복사할 요소의 갯수
        System.out.println(Arrays.toString(copy1)); // [0, 1, 2, 3, 4]

        int[] copy2 = Arrays.copyOf(copy, 3);
        // 길이가 3이니까 0,1,2 총 3개의 인덱스를 출력한다
        System.out.println(Arrays.toString(copy2));// [0, 1, 2]

        int[] copy3 = Arrays.copyOf(copy, 7);
        // 복사할 길이가 7이니까 나머지는 0으로 채운다.
        System.out.println(Arrays.toString(copy3));// [0, 1, 2, 3, 4, 0, 0]

        int[] copy4 = Arrays.copyOfRange(copy,2,4);
        // from,to 2~4까지 복사하라는 뜻이다 중요한건 마지막 to는 포함이 안된다.
        System.out.println(Arrays.toString(copy4)); // [2, 3]

        int[] copy5 = Arrays.copyOfRange(copy,0,7);
        // 마찬가지로 배열의 길이가 넘으면 0으로 채운다.
        System.out.println(Arrays.toString(copy5));// [0, 1, 2, 3, 4, 0, 0]

        //배열의 정렬 - sort() : 배열을 오름차순으로 정렬한다.
        int[] sort  = {3,2,0,1,4};
        Arrays.sort(sort); // 배열을 정렬한다.
        System.out.println(Arrays.toString(sort)); // [0, 1, 2, 3, 4]









    }
}
