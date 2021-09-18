package easybook.array;

public class CloneArray {
    public static void main(String[] args) {
        int[] arr1 = {9, 5, 2, 7};
        int[] arr2 = arr1.clone();

        arr2[1] = 0;
        arr2[2] = 3;

        for(int i=0; i<arr1.length; i++) {
            System.out.println("arr1 = " + arr1[i]);
        }

        for(int i=0; i< arr2.length; i++) {
            System.out.println("arr2 = " + arr2[i]);
        }
    }
}
