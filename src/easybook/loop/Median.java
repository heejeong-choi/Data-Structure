package easybook.loop;

import java.util.Scanner;

//세 값중 중앙값 구하기 프로그래밍
public class Median {
    static int med3(int a, int b, int c) {
        if(a>=b) //a가 b보다 클 경우
            if(b>=c) //거기에 b는 c보다 큰 경우
                return b; //b를 반환
            else if(a<=c) //a가 b보다는 크지만, a가 c보다는 작은 경우
                return a; //a반환
            else //그게 아닌 경우에는
                return c; //c반환
        else if(a>c) //a가 b보다 작고, a>c보다 크면
            return a; //a반환
        else if(b>c) //a가 b보다 작고, b가 c보다 크면
            return c; // c반환
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값: ");
        int a = scanner.nextInt();

        System.out.println("b의 값: ");
        int b = scanner.nextInt();

        System.out.println("c의 값: ");
        int c = scanner.nextInt();

        System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");
    }
}
