package dynamicProgramming.leetcode;

public class Offer1716 {
    public static void main(String[] args) {

    }
    public int massage(int[] nums) {

        //构造dp数组
        int n = nums.length;
        //判断处理边界条件
        if(n == 0) return 0;
        //选择i位置的最长预约时长
        int[] f = new int[n];
        //不选择i位置的最长预约时长
        int[] g = new int[n];
        //初始化
        f[0] = nums[0];
        g[0] = 0;
        //状态转移
        for(int i = 1;i < n;i++){
            f[i] = nums[i] + g[i-1];
            g[i] = Math.max(f[i-1],g[i-1]);
        }
        return Math.max(f[n-1],g[n-1]);
    }
}
