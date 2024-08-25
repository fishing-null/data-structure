package hash.leetcode;

import java.util.HashMap;

public class Num287 {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) > 1) return nums[i];
        }
        return -1;
    }
}
