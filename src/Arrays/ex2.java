package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        String[] myArr = {"heejeong", "que", "Jackson", "Choi"};

        Arrays.sort(myArr); // String Array의 Comparable 구현
        System.out.println("myArr = " + Arrays.toString(myArr));

        Arrays.sort(myArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구문X
        System.out.println("myArr = " + Arrays.toString(myArr));

        Arrays.sort(myArr, new Descending()); // 알파벳 역순
        System.out.println("myArr = " + Arrays.toString(myArr));
    }
}
