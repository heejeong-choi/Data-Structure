package easybook.search;

import java.util.Scanner;

//선형 검색 프로그래밍 구현
public class SequenceSearch {
    //요소수가 n개인 배열 a에서 key와 같은 요소를 선형 검색한다
    static int sequenceSearch(int[] a, int n, int key) {
        int i = 0;

        while(true) {
            if(i==n)
                return -1; //검색 실패로 -1반환
            if(a[i] == key)
                return i; //검색 성공이니까 i반환
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num]; //요솟수가 num개인 배열

        for(int i=0; i<num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.println("검색할 값: "); //키 값 입력
        int ky = scanner.nextInt();
        int idx = sequenceSearch(x, num, ky); //배열 x에서 키 값이 ky인 요소를 검색

        if(idx == -1)
            System.out.println("해당 값의 요소가 없습니다.");
        else
            System.out.println(ky + "는 x[" + idx + "]에 있습니다. ");
    }
}
