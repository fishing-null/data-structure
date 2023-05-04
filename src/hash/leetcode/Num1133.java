package hash.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Num1133 {
    public static void main(String[] args) {

    }
    public int largestUniqueNumber(int[] nums) {
        int[] r = new int[1001];
        for (int i = 0; i < nums.length; i++) {
            r[nums[i]]++;
        }
        for (int i = 1000; i >= 0 ; i--) {
            if(r[i] == 1){
                return i;
            }
        }
        return -1;
    }
}
