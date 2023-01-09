package hash.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Num350 {
    public static void main(String[] args) {

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return  intersect(nums2,nums1);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        int index = 0;
        int[] ret = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            int count = map.getOrDefault(nums2[i],0);
            if(count > 0){
                ret[index] = nums2[i];
                index++;
                count--;
                if(count>0){
                    map.put(nums2[i],count);
                }else{
                    map.remove(nums2[i]);
                }
            }
        }
        return Arrays.copyOfRange(ret,0,index);
    }
}
