package easybook.array;

import java.util.Scanner;

public class ArrayEqual {
    static boolean equals(int[] a, int[] b) {
        if(a.length != b.length)
            return false;
        //두 배열 a,b의 개수를 비교. 개수가 다르면 배열이 같지 않기 때문에 바로 false 반환

        for(int i=0; i<a.length; i++)
            if(a[i] != b[i])
                return false;

        //두 배열을 처음부터 스캔하면서 a와 b의 값을 비교하는 것을 반복.

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 a의 요솟수: ");
        int numA = scanner.nextInt();
        int[] a = new int[numA];

        for(int i=0; i<numA; i++) {
            System.out.println("a["+i+"] : ");
            a[i] = scanner.nextInt();
        }

        System.out.print("배열 b의 요솟수: ");
        int numB = scanner.nextInt();
        int[] b = new int[numB];

        for(int i=0; i<numB; i++) {
            System.out.print("b["+i+"] : ");
            b[i] = scanner.nextInt();
        }

        System.out.println("배열 a와 b는 " + (equals(a,b) ? "같습니다." : "같지 않습니다."));
    }
}
