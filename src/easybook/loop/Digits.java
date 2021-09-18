package easybook.loop;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //시스템으로 부터 입력을 받는다
        int num;

        System.out.println("두자리 정수를 입력해주세요.");

        do {
            System.out.println("입력 : ");
            num = scanner.nextInt();
        } while (num < 10 || num > 99); //2자리 수로 제한하는법 구현

        System.out.println("변수 num 값은 " + num + "가 되었습니다.");
    }
}
