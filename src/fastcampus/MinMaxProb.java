package fastcampus;

public class MinMaxProb {
    public static void main(String[] args) {
        int[] numbers = {17, 66, 93, 3, 82, 65, 51, 79, 20, 13, 43, 84}; // 배열 정의

        int min = numbers[0]; //최솟값 초기화
        int max = numbers[0]; //최댓값 초기화
        int minPos = 0;
        int maxPos = 0;

        for(int i=1; i<numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
                minPos = i+1; //위치
            }
            if(max < numbers[i]) {
                max = numbers[i];
                maxPos = i+1; //위치
            }
        }

        System.out.println("Max value: " + max + ", and The location of max value in array " + maxPos);
        System.out.println("Min value: " + min + ", and The location of min value in array " + minPos);
    }
}
