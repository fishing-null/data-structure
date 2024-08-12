package binary.leetcode;

public class Num68 {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target) left = mid + 1;
            else right = mid;

        }
        if(nums[left] < target) return right + 1;
        return left;
    }
}
