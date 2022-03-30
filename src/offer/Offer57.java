package offer;

public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left] + nums[right] == target){
                return new int[] {nums[left], nums[right]};
            }
            if(nums[left] + nums[right] < target){
                left++;
            }
            if(nums[left] + nums[right] > target){
                right--;
            }
        }
        return new int[] {};
    }
}
