package array.leetcode;

public class Num1480 {
    public static void main(String[] args) {

    }
    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i == 0){
                continue;
            }else {
                nums[i] += nums[i-1];
            }
        }
        return nums;
    }
}
