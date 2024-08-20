package binary.leetcode;

public class Lcr068 {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        //target位于边界的情况
        if(nums[left] < target) return right + 1;
        return right;
    }

}
