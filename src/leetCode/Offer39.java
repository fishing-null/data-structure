package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Offer39 {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,2,2,5,4,2};
        majorityElement(a);
    }
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],1+map.getOrDefault(nums[i],0));
        }
        int max = 0;
        int key = 0;
        for(Map.Entry<Integer,Integer> i: map.entrySet()){
            if(i.getValue()>max){
                max = i.getValue();
                key = i.getKey();
            };
        }
        return key;
    }
}
