package list.leetcode;

public class Num88 {
    public static void main(String[] args) {
        Num88 num88 = new Num88();
        num88.merge(new int[] {1,2,3,0,0,0},3,new int[] {2,5,6},3);

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0,p2 = 0,p3 = 0;
        int[] ret = new int[m + n];
        while(p1 < m && p2 < n){
            if(nums1[p1] <= nums2[p2]){
                ret[p3++] = nums1[p1++];
            }else{
                ret[p3++] = nums2[p2++];
            }
        }
        while(p1 < m){
            ret[p3++] = nums1[p1++];
        }
        while(p2 < n){
            ret[p3++] = nums2[p2++];
        }
        for (int i = 0; i < m+n; i++) {
            nums1[i] = ret[i];
        }
    }
}
