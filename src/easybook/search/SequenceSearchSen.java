package easybook.search;

import java.util.Scanner;

//보초법을 이용한 선형검색
public class SequenceSearchSen {
    public static int sequenceSearchSen(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;//보초추가(검색할 값 key를 보초로 a[n]에 대입

        while (true) {
            if(a[i] == key) //검색 성공한 경우
                break;
            i++;
        }

        return i == n ? -1: i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟 수: ");

        int num = scanner.nextInt();
        int[] x = new int[num + 1]; //요솟수 = num + 1

        for(int i=0; i<num; i++){
            System.out.println("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.println("검색할 값: "); //키 값을 입력
        int ky = scanner.nextInt();

        int idx = sequenceSearchSen(x, num, ky); //배열 x에서 값이 ky인 요소를 검색

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
    }
}
