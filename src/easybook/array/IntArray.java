package easybook.array;

public class IntArray {
    public static void main(String[] args) {
        int[] intArr = new int[4];

        intArr[1] = 9;
        intArr[2] = 5;

        intArr[0] = intArr[2]*2;

        for(int i=0; i<intArr.length; i++) {
            System.out.println("intArr[" + i +  "] = " + intArr[i]);
        }
    }
}
