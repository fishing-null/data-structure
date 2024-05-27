package dynamicProgramming.leetcode;

public class Num152 {
    public static void main(String[] args) {
        Num152 num152 = new Num152();
        num152.maxProduct(new int[] {-2,3,-4});

    }
    public int maxProduct(int[] nums) {
        //创建dp数组
        int n = nums.length;
        //判断边界
        if(n == 1) return nums[0];
        int[] dp0 = new int[n+1];
        int[] dp1 = new int[n+1];
        dp0[0] = 1;
        dp1[0] = 1;
        int ret = Integer.MIN_VALUE;
        //状态转移
        for(int i = 1;i < n + 1;i++){
            int x = nums[i-1],y = dp0[i-1]*nums[i-1],z = dp1[i-1]*nums[i-1];
            dp0[i] = Math.max(x,Math.max(y,z));
            dp1[i] = Math.min(x,Math.min(y,z));
            ret = Math.max(ret,dp0[i]);
        }
        return ret;
    }
}
