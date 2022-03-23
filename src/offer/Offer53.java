package offer;

import java.util.HashMap;
import java.util.Map;

public class Offer53 {
    public int search(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1+map.getOrDefault(nums[i],0));
        }
        if(map.containsKey(target)){
            return map.get(target);
        }
        return 0;
    }
}
