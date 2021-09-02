package Arrays;

/**
 * 심각한 인플레이션을 겪고 있는 어느나라에서 1만원, 2만원, 5만원, 10만원 20만원 50만원 여섯가지 지폐를 사용하고 있다.
 * 배고파씨는 100만원 어치 빵을 사려고 마트에 가서 돈을 내려다 여섯 가지 지폐를 이용하여 100만원 어치 빵을 사는 방법이 모두 몇 가지인지궁금해 졌다.
 * 지불하는 방법은 모두 몇 가지가 있을까?
 * 예를 들어 1만원 10장, 10만원 4장, 50만원 1장 으로 100만원을 지불 할 수 있다.
 * 모두 몇가지인지 구하세요.
 * **/

public class BruteForceSearch {
    public static void main(String[] args) {
        int[] money = {1, 2, 5, 10, 20, 50};

        int method = 0;
        int goal = 100;
        int i0, i1, i2, i3, i4;

        for(i0=goal; i0>=0; i0 -= money[0]) {
            for(i1=goal; i1>=0; i1 -= money[1]) {
                for(i2=goal; i2>=0; i2 -= money[2]) {
                    for(i3=goal; i3>=0; i3 -= money[3]) {
                        for(i4=goal; i4>=0; i4 -= money[4])
                            if(i4 % money[5] == 0)
                                method++;
                    }
                }
            }
        }

        System.out.println("Total method to pay: " + method);
    }
}
