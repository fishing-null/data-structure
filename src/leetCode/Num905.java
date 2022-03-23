package leetCode;

public class Num905 {
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int left = 0;
            int right = nums.length-1;
            if(nums == null || nums.length == 1){
                return nums;
            }
            while(left < right){
                if((nums[left]&1)==1&&(nums[right]&1)==0){
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                if((nums[left]&1)==0){
                    left++;
                }
                if((nums[right]&1)==1){
                    right--;
                }
            }
            return nums;
        }
    }
}
