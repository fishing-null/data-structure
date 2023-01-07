package array.leetcode;

public class Num88 {
    public static void main(String[] args) {
        
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] ret = new int[m+n];
        int cur = 0;
        while(p1<m || p2<n){
            if(p1 == m){
                cur = nums2[p2];
                p2++;
            }else if(p2 == n){
                cur = nums1[p1];
                p1++;
            }else if(nums1[p1] < nums2[p2]){
                cur = nums1[p1];
                p1++;
            }else{
                cur = nums2[p2];
                p2++;
            }
            ret[p1+p2-1] = cur;
        }
        for (int i = 0; i < m+n; i++) {
            nums1[i] = ret[i];
        }
    }
}
