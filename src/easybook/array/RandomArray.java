package easybook.array;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    static int maxOf(int[] example1) {
        int max = example1[0];
        for(int i=1; i<example1.length; i++)
            if(example1[i] > max)
                max = example1[i];
    return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scn = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수: ");
        int num = scn.nextInt();

        int[] height = new int[num];

        System.out.println("키 값은 아래와 같습니다.");

        for(int i=0; i<num; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height));
    }
}
