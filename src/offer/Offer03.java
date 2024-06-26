package offer;

import java.util.HashSet;
import java.util.Set;

public class Offer03 {
    public int findRepeatNumber(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i],1+map.getOrDefault(nums[i],0));
//        }
//        for(int i: map.keySet()){
//            if(map.get(i) > 1){
//                return i;
//            }
//        }
//        return -1;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return i;
            } else{
                set.add(i);
            }
        }
        return -1;
    }
}
