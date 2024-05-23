package dynamicProgramming.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Num2008 {
    public static void main(String[] args) {
        Num2008 num2008 = new Num2008();
        num2008.maxTaxiEarnings(20,new int[][] {{1,6,1},{3,10,2},{10,12,3},{11,12,2},{12,15,2},{13,18,1}});

    }
    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides, (a, b) -> a[1] - b[1]);
        int m = rides.length;
        long[] dp = new long[m + 1];
        for (int i = 0; i < m; i++) {
            int j = binarySearch(rides, i , rides[i][0]);
            dp[i + 1] = Math.max(dp[i],dp[j] + rides[i][1] - rides[i][0] + rides[i][2]);
        }
        return dp[m];
    }

    private int binarySearch(int[][] rides, int high, int target) {
        int low = 0;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (rides[mid][1] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
