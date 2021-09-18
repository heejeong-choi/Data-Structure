package easybook.loop;

import java.util.Scanner;

//입력 받은 10진수를 2진수~36진수 기수 변환하여 나타내는 프로그래밍
public class CardConvRev {
    //정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
    static int carddConvRe(int x, int r, char[] d) {
        int digits = 0; //변환 후 자릿수를 말함
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지를 저장
            x /= r;
        } while(x != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = scanner.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36): ");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 36);

            dno = carddConvRe(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for(int i=dno-1; i>=0; i--)
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.println("한번 더 할까요? (1.예 / 2. 아니오)");
            retry = scanner.nextInt();
        } while (retry == 1);
    }
}
