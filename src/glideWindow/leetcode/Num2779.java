package glideWindow.leetcode;

import java.util.Arrays;

public class Num2779 {
    public static void main(String[] args) {
        Num2779 num2779 = new Num2779();
        num2779.maximumBeauty(new int[] {4,6,1,2},2);

    }
    public int maximumBeauty(int[] nums, int k) {
        int ret = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0,j = 0; i < n; i++) {
            while (nums[i] - nums[j] > 2*k){
                //表示超出范围的情况,左边界缩小
                j++;
            }
            ret = Math.max(ret,i - j + 1);
        }
        return  ret;
    }
}
