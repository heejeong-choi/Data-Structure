package easybook.array;

import java.util.Scanner;

//신체검사 데이터용 클래스 배열에서 평균 키와 시력 분포 구하기
class PhysicalTest {
    static final int VMAX = 21; //시력분포 0부터 2.0까지 0.1단위로

    static class PhyscData {
        String name;
        int height;
        double vision;

        //생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    //키 평균값 구하는 메서드
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for(int i=0; i<dat.length; i++)
            sum += dat[i].height;

        return sum / dat.length;
    }

    //시력 분포 구하기
    static void distVision(PhyscData[] dat, int[] dist) {
        int i=0;

        dist[i] = 0;

        for(i=0; i<dat.length; i++)
                if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                    dist[(int)(dat[i].vision * 10)]++;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("Lisa", 160, 1.2),
                new PhyscData("Brandi", 174, 0.2),
                new PhyscData("Kyle", 156, 0.8),
                new PhyscData("Yolanda", 172, 0.5),
                new PhyscData("Kim", 160, 0.2),
                new PhyscData("camil", 168, 0.7)
        };

        int[] vdist = new int[VMAX]; //시력 분포

        System.out.println("신체검사 리스트");
        System.out.println("이름     키    시력");
        System.out.println("------------------");

        for(int i=0; i<x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");

        for(int i=0; i<VMAX; i++)
            System.out.printf("%3.1f~ : %2d명\n", i/10.0, vdist[i]);
    }
}
