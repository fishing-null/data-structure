package dynamicProgramming.leetcode;

import java.util.Arrays;

public class Lcp18 {
    public static void main(String[] args) {
    }
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int ans = 0;
        int left = 0;
        int right = drinks.length - 1;
        while(left < staple.length && right >= 0){
            if(staple[left] + drinks[right] > x) right --;
            else{
                ans += (right+1);
                ans %= 1000000007;
                left++;
            }
        }
        return ans;
    }
}
