package hash.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Num2404 {
    public static void main(String[] args) {

    }
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int ret = -1,count = 0;
        for(Map.Entry<Integer,Integer> num:map.entrySet()){
            if(ret == -1 || num.getValue() > count || num.getValue() == count && ret > num.getKey()){
                ret = num.getKey();
                count = num.getValue();
            }
        }
        return ret;
    }
}
