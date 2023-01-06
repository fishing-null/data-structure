package hash.leetcode;

import java.util.*;

public class Num448 {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for(int num:nums){
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
                if(nums[i] <=n){
                    ret.add(i + 1);
                }
        }
        return ret;
    }
}
