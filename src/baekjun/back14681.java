package baekjun;

import java.util.Scanner;

public class back14681 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int xValue = scanner.nextInt();
        int yValue = scanner.nextInt();

        if(xValue == 0 || yValue == 0) {
            System.out.println("Wrong input; both x and y can't be zero.");
        } else if (xValue > 0 && yValue > 0) {
            System.out.println("1");
        } else if (xValue < 0 && yValue > 0) {
            System.out.println("2");
        } else if (xValue < 0 && yValue < 0) {
            System.out.println("3");
        } else if (xValue > 0 && yValue < 0) {
            System.out.println("4");
        }
    }
}
