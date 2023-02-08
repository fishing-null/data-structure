package array.leetcode;

import java.util.Arrays;

public class Num1413 {
    public static void main(String[] args) {
        Num1413 num1413 = new Num1413();
        num1413.minStartValue(new int[] {-3,2,-3,4,2});
    }
    public int minStartValue(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i == 0){
                continue;
            }else {
                nums[i] = nums[i] + nums[i-1];
            }
        }
        Arrays.sort(nums);
        return nums[0] > 1 ? 1 : Math.abs(nums[0])+1;
    }
}
