package easybook.stack;

import java.util.Scanner;

//int형 스태긔 사용의 테스터
class IntStackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack intStack = new IntStack(64); //최대 64개의 용량을 가질 수 있는 스택

        while(true) {
            System.out.println("현재 데이터 수: " + intStack.size() + " / " + intStack.capacity());

            System.out.println("1. push / 2. pop / 3. peek / 4. dump / 0. exit");

            int menu = scanner.nextInt();
            if(menu == 0) break;

            int x;
            switch(menu) {
                case 1:
                    System.out.println("데이터: ");
                    x = scanner.nextInt();

                    try {
                        intStack.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }

                    break;

                case 2:
                    try {
                        x = intStack.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }

                    break;

                case 3:
                    try {
                        x = intStack.peek();
                        System.out.println("피크한 데이터는" + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }

                    break;

                case 4:
                    intStack.dump();
                    break;
            }
        }
    }
}
