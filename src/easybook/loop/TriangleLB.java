package easybook.loop;

import java.util.Scanner;

//왼쪽 아래가 직각인 이등변 삼각형을 출력하는 프로그래밍 (별찍기 프로그래밍)
public class TriangleLB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력");

        do {
            System.out.print("몇 단 삼각형 입니까?: ");
            num = scanner.nextInt();
        } while(num <= 0);

        for(int i=1; i<=num; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
