package easybook.array;

import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] ex1, int idx1, int idx2) {
        int t = ex1[idx1];
        ex1[idx1] = ex1[idx2];
        ex1[idx2] = t;
    }

    static void reverse(int[] ex1) {
        for(int i=0; i<ex1.length; i++) {
            swap(ex1, i, ex1.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("요소의 수");
        int num = scn.nextInt();

        int[] x = new int[num];

        for(int i=0; i<num; i++) {
            System.out.println("x[" + i + "]");
            x[i] = scn.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬 : ");
        for(int i=0; i<num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
