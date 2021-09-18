package easybook.loop;

import java.util.Scanner;

//1부터 n까지 합 구하기
public class SumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = scanner.nextInt();

        int sum = 0; //총 합
        int i = 1; //더하는 시작점

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}
