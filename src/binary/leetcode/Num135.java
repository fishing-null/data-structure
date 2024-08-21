package binary.leetcode;

public class Num135 {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        int left = 0,right = nums.length - 1;
        int len = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[len]){
                left  = mid + 1;
            }else {
                right = mid;
            }
        }
        return nums[left];
    }
}
