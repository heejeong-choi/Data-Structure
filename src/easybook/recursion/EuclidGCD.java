package easybook.recursion;

import java.util.Scanner;

class EuclidGCD {
    //정수 x,y의 최대 공약수를 구해 반환한다
    static int gdc(int x, int y) {
        if(y==0)
            return x;
        else
            return gdc(y, x%y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수 구하기");
        System.out.print("정수를 입력하세요: "); int x = scanner.nextInt();
        System.out.print("정수를 입력하세요: "); int y = scanner.nextInt();

        System.out.println("최대 공약수는 " + gdc(x,y) + "입니다.");
    }
}