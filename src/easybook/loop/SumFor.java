package easybook.loop;

import java.util.Scanner;

//while문이 아닌 for문으로 총 합 구하기
public class SumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("1부터 n 까지의 합을 구합니다.");

        do {
            System.out.println("n의 값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int sum = 0;

        for(int i=1; i<=n; i++)
            sum += i;


        System.out.println(sum);
    }
}
