package binary.leetcode;

public class Num704 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}
