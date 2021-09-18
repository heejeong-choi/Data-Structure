package easybook.array;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] numberArr) {
        int max = numberArr[0];

        for(int i=1; i<numberArr.length; i++) {
            if(numberArr[i] > max)
                max = numberArr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Max value");
        System.out.print("How many people? ");
        int num = scn.nextInt();

        int[] height = new int[num];

        for(int i=0; i<num; i++) {
            System.out.println("height[" + i + "] : ");
            height[i] = scn.nextInt();
        }

        System.out.println("Max value is " + maxOf(height));
    }
}
