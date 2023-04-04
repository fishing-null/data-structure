package math.leetcode;

import java.util.Arrays;

public class Num1561 {
    public static void main(String[] args) {
            Num1561 num1561 = new Num1561();
            num1561.maxCoins(new int[] {1,2,3,4,5,6,7,8,9});

    }
    public int maxCoins(int[] piles) {
        int ret = 0;
        Arrays.sort(piles);
        for (int i = piles.length-2; i > piles.length/3-1;) {
            ret += piles[i];
            i -= 2;
        }
        return ret;
    }
}
