package stack.leetcode;

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
    }
}
