package dynamicProgramming.leetcode;

public class Num1567 {
    public static void main(String[] args) {

    }
    public int getMaxLen(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        //初始化dp数组
        int n = nums.length;
        int[] dp0 = new int[n+1];
        int[] dp1 = new int[n+1];
        //处理边界
        if(nums.length == 1) return nums[0] > 0 ? 1 : 0;
        dp0[0] = 0;
        dp1[0] = 0;
        //状态转移
        for (int i = 1; i < n + 1; i++) {
            if(nums[i-1] > 0){
                dp0[i] = dp0[i-1] + 1;
                dp1[i] = dp1[i-1] == 0 ? 0 : dp1[i-1] +1;
            }else if(nums[i-1] < 0){
                dp0[i] = dp1[i-1] == 0 ? 0 : dp1[i-1] + 1;
                dp1[i] = dp0[i-1] + 1;
            }
            maxCount = Math.max(dp0[i],maxCount);
        }
        return maxCount;
    }
}
