package sort.leetcode;

public class Offer51 {
    public int reversePairs(int[] nums) {
        int ret = reversePairsHelper(nums,0,nums.length-1);
        return ret;
    }

    private int reversePairsHelper(int[] nums, int l, int r) {
        if(l >= r){
            return 0;
        }
        int mid = l+((r-l)>>1);
        int left = reversePairsHelper(nums,l,mid);
        int right = reversePairsHelper(nums,mid+1,r);
        if(nums[mid] > nums[mid+1]){
            return merge(nums,l,r,mid)+right+left;
        }
        return left+right;
    }

    private int merge(int[] nums, int l, int r, int mid) {
        int[] aux = new int[r-l+1];
        int ret = 0;
        for (int i = 0; i < aux.length; i++) {
            aux[i] = nums[i+l];
        }
        int i = l;
        int j = mid+1;
        for (int k = l; k <= r ; k++) {
            if(i>mid){
                nums[k] = aux[j-l];
                j++;
            }else if(j>r){
                nums[k] = aux[i-l];
                i++;
            }else if(aux[i-l] <= aux[j-l]){
                nums[k] = aux[i-l];
                i++;
            }else{
                nums[k] = aux[j-l];
                j++;
                ret += mid-i+1;
            }
        }
        return ret;
    }
}
