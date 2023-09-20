package array.leetcode;

public class Num88 {
    public static void main(String[] args) {
        Num88 num88 = new Num88();
        num88.merge(new int[]{1,2,3},3,new int[]{4,5,6},3);
        
    }
    public void merge(int[] A, int m, int[] B, int n) {
//        int p1 = 0, p2 = 0;
//        int[] ret = new int[m+n];
//        int cur = 0;
//        while(p1<m || p2<n){
//            if(p1 == m){
//                cur = nums2[p2];
//                p2++;
//            }else if(p2 == n){
//                cur = nums1[p1];
//                p1++;
//            }else if(nums1[p1] < nums2[p2]){
//                cur = nums1[p1];
//                p1++;
//            }else{
//                cur = nums2[p2];
//                p2++;
//            }
//            ret[p1+p2-1] = cur;
//        }
//        for (int i = 0; i < m+n; i++) {
//            nums1[i] = ret[i];
//        }
        int p1=0,p2=0,cur=0;
        int[] ret = new int[m+n];
        while(p1 < m || p2 < n){
            if(p1 == m){
                ret[cur++] = B[p2++];
            }else if(p2 == n){
                ret[cur++] = A[p1++];
            }else if(A[p1] <= B[p2]){
                ret[cur++] = A[p1++];
            }else if(A[p1] > B[p2]){
                ret[cur++] = B[p2++];
            }

        }
        for(int i =0;i<A.length;i++){
            A[i] = ret[i];
        }
    }
}
