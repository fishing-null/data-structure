package Stack.leetcode;

import java.util.*;

public class Num349 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5,6};
        int[] nums2 = {9,4,9,8,4,6};
        intersection(nums1,nums2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        for(int i:set2){
            queue.add(i);
        }
        int[] values = new int[queue.size()];
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            values[i] = queue.poll();
        }
        return values;
    }
}
