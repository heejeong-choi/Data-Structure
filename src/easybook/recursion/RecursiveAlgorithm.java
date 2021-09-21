package easybook.recursion;

import java.util.Scanner;

class RecursiveAlgorithm {
    //재귀 함수
    static void recursiveAlgorithm(int n) {
        if(n>0) {
            recursiveAlgorithm(n-1);
            System.out.println(n);
            recursiveAlgorithm(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        recursiveAlgorithm(x);
    }
}
