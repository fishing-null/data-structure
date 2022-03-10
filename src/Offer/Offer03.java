package Offer;

import java.util.HashMap;
import java.util.Map;

public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],1));
        }
        for(int i: map.keySet()){
            if(map.get(i) > 1){
                return i;
            }
        }
        return -1;
    }
}
