package dynamicProgramming.leetcode;

public class Num34 {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[] {-1,-1};
        //特殊判断
        if(nums.length == 0) return ret;
        //查找左端点
        int left = 0,right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] >= target){
                right = mid;
            }
        }
        //判断是否有结果
        if(nums[left] != target)return ret;
        else ret[0] = right;

        //重置区间,查找右端点
        left = 0;right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left + 1) / 2;
            if(nums[mid] <= target){
                left = mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }
        }
        ret[1] = left;
        return ret;
    }
}
