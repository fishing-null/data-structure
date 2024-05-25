package hash.leetcode;

import java.util.HashMap;

public class Num100309 {
    public static void main(String[] args) {

    }
    public int duplicateNumbersXOR(int[] nums) {
        int ret = 51;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) == 2){
                ret ^= nums[i];
            }
        }
        ret ^= 51;
        return ret;
    }
}
