package array.leetcode;

public class Num1658 {
    public static void main(String[] args) {

    }
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for(int i:nums){
            total += i;
        }
        int target = total-x;
        if(target < 0){
            return -1;
        }
        int ret = -1;
        for (int left = 0,right = 0,tmp = 0;right < nums.length ; right++) {
            tmp += nums[right];
            while (tmp > target){
                tmp -= nums[left];
                left++;
            }
            if(tmp == target){
                ret = Math.max(ret,right - left + 1);
            }

        }
        return ret == -1 ? -1 : nums.length - ret;
    }
}
