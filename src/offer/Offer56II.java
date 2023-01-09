package offer;

import java.util.HashMap;

public class Offer56II {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
//        int[] counts = new int[32];
//        for(int num : nums) {
//            for(int j = 0; j < 32; j++) {
//                counts[j] += num & 1;
//                num >>>= 1;
//            }
//        }
//        int res = 0, m = 3;
//        for(int i = 0; i < 32; i++) {
//            res <<= 1;
//            res |= counts[31 - i] % m;
//        }
//        return res;
        if(nums.length == 1){
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:nums){
            if(map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}
