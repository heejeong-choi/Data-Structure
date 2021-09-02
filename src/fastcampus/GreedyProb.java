package fastcampus;

/**
 * 최적해를 구하는 데에 사용되는 근사적인 방법으로,
 * 여러 경우 중 하나를 결정해야 할 때마다 그 순간에 최적이라고 생각되는 것을
 * 선택해 나가는 방식으로 진행하여 최종적인 해답에 도달한다.

  < Problem >
 가게에 간 철수는 8370원 어치 물건을 구매하였습니다.
 철수에게는 500원짜리 20개 100원짜리 20개  50원짜리 20개 10원짜리 20개의 동전이 있습니다.
 철수는 금액을 지불 할 때 단위가 큰 동전부터 지불하려고 합니다.
 철수가 지불하게 되는 각 동전의 개수를 구하세요
 * **/

public class GreedyProb {
    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10};
        int totalPrice = 8370;
        int count;

        for(int i=0; i<coins.length; i++) {
            count = 0;
            count += totalPrice / coins[i];
            totalPrice = totalPrice % coins[i];

            System.out.println(coins[i] + "짜리 동전 " + count + "개가 필요합니다.");
        }
    }
}
