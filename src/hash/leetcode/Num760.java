package hash.leetcode;

import java.util.HashMap;

public class Num760 {
    public static void main(String[] args) {

    }
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] ret = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i],i);
        }
        for (int i = 0; i < nums2.length; i++) {
            int tmp = map.get(nums1[i]);
            ret[i] = tmp;
        }
        return ret;
    }
}
