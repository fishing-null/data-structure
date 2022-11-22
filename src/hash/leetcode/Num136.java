package hash.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Num136 {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],1+map.getOrDefault(nums[i],0));
        }
        for(int i: map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
}
