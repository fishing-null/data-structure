package Leetcode;

import java.util.*;

public class Num6020 {
    public boolean divideArray(int[] nums) {
        int n = nums.length/2;
        List<Integer> s = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
            set.add(nums[i]);
        }
        for(int num:set){
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == num){
                    count ++;
                }
            }
            map.put(num,count);
        }
        int ret = 0;
        for(int num: map.values()){
            ret += num/2;
        }
        return ret == n ?true:false;
    }
}
