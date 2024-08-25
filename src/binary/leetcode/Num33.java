package binary.leetcode;

public class Num33 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0] == target ? 0 : -1;
        int left =  0,right = nums.length - 1;
        while(left  <= right){
            int mid = left + (right - left ) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] >= nums[0]){
                if(nums[0] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[nums.length - 1]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
