package array.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Num229 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i) > nums.length/3){
                list.add(i);
            }
        }
        return list;
    }
}
