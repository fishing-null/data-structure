package leetCode;

import java.util.*;

public class Num496 {
    class Solution {
        private Stack<Integer> s = new Stack<>();
        private Map<Integer,Integer> map = new HashMap<>();
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            for (int i = nums2.length-1; i >= 0 ; i--) {
                while(!s.isEmpty() && s.peek()<=nums2[i]){
                    s.pop();
                }
                int value = s.isEmpty() ? -1 : s.peek();
                s.push(nums2[i]);
                map.put(nums2[i],value);
            }
            int[] ret = new int[nums1.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = map.get(nums1[i]);
            }
            return ret;
        }
    }
}
