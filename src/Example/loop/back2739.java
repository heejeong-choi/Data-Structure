package Example.loop;

import java.util.Scanner;

public class back2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiple = scanner.nextInt();
        scanner.close();

        for(int i=1; i<10; i++) {
            System.out.println(multiple + " * " + i + " = " + multiple*i);
        }
    }
}
