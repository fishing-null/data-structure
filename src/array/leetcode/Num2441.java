package array.leetcode;

import java.util.*;

public class Num2441 {
    public static void main(String[] args) {
        Num2441 num2441 = new Num2441();
        System.out.println(num2441.findMaxK(new int[] {-9,-43,24,-23,-16,-30,-38,-30}));

    }
    public int findMaxK(int[] nums) {
        int k = -1;
        Set<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        for(int x:nums) {
            if (set.contains(-x)) {
                k = Math.max(k, x);
            }
        }
        return k;
    }
}
