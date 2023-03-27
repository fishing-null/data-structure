package stack.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Num496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //1.暴力法+模拟
//        int m = nums1.length,n = nums2.length;
//        int[] ret = new int[m];
//        for (int i = 0; i < nums1.length; i++) {
//            int j = 0;
//            while(j < n && nums1[i] != nums2[j] ){
//                j++;
//            }
//            while (j < n && nums1[i] >= nums2[j]){
//                j++;
//            }
//            ret[i] = j < n ? nums2[j] : -1;
//        }
//            return ret;
        //2.单调栈+哈希表
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = nums2.length; i >= 0 ; i--) {
            int num = nums2[i];
            while(!deque.isEmpty() && num >= deque.peek()){
                deque.pop();
            }
            map.put(num,deque.isEmpty()?-1:deque.peek());
            deque.push(num);
        }
        int[] ret = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ret[i] = map.get(nums1[i]);
        }
        return ret;
    }
}
