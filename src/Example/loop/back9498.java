package Example.loop;

import java.util.Scanner;

public class back9498 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else if(score >= 60) {
            System.out.println("D");
        } else if(score < 60) {
            System.out.println("F");
        }
    }
}
