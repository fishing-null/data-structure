package greedyAlgorithm.leetcode;

import java.util.Arrays;

public class Num1798 {
    public static void main(String[] args) {

    }
    public int getMaximumConsecutive(int[] coins) {
        int ret = 1;
        Arrays.sort(coins);
        for(int i:coins){
            if(i > ret){
                break;
            }
            ret += i;
        }
        return ret;
    }
}
