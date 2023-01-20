package leetCode;

import java.util.Arrays;

public class LCP28 {
    public static void main(String[] args) {

    }
    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0,right = nums.length-1;
        int count = 0;
        while (left<right){
            int tmp = nums[left] + nums[right];
            if(tmp <= target){
                count += right-left;
                left++;
            }else{
                right--;
            }
            count = count%1000000007;
        }
        return count;
    }
}
