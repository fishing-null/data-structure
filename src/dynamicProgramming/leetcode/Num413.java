package dynamicProgramming.leetcode;

public class Num413 {
    public static void main(String[] args) {

    }
    public int numberOfArithmeticSlices(int[] nums) {
        //构造dp数组
        int n = nums.length;
        //处理边界值
        if(n < 3) return 0;
        int[] dp = new int[n];
        //初始化
        dp[0] = 0;
        dp[1] = 0;
        int ret = 0;
        //状态转移
        for(int i = 2;i < n;i++){
            dp[i] = (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) ? dp[i-1] + 1 : 0;
            ret += dp[i];
        }
        //返回值
        return ret;
    }
}
