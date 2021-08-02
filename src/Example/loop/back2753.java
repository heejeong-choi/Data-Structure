package Example.loop;

import java.util.Scanner;

class back2753 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        int nonLeapMonth1 = year%4;
        int nonLeapMonth2 = year%100;

        if(nonLeapMonth1 == 0 && nonLeapMonth2 ==0) {
            System.out.println("윤달입니다");
        } else if(year > 4000 || year < 0) {
            System.out.println("wrong intput");
        } else if(nonLeapMonth1 != 0 || nonLeapMonth2 !=0) {
            System.out.println("윤달이 아닙니다");
        }
    }
}
