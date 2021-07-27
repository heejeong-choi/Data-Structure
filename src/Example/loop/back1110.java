package Example.loop;

import java.util.Scanner;

public class back1110 {

    public static void main(String[] args) {

        System.out.println("입력값: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int setNum = num;
        int count = 0;

        while(true) {
            int left = setNum/10;
            int right = setNum%10;
            setNum = right*10 + (left+right)%10;
            count++;

            if(num==setNum)   {
                break;
            }
        }

        System.out.println("길이: ");
        System.out.println(count);
    }
}
