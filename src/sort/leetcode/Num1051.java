package sort.leetcode;

import java.util.Arrays;

public class Num1051 {
    public static void main(String[] args) {

    }
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] orderHeights = Arrays.copyOf(heights,len);
        Arrays.sort(orderHeights);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(orderHeights[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
