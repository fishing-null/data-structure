package dynamicProgramming.leetcode;

import java.util.Arrays;

public class Lcr090 {
    public static void main(String[] args) {
        Lcr090 lcr090 = new Lcr090();
        lcr090.rob(new int[ ] {1,2,3,1});
    }
    public int rob(int[] nums) {
        //处理边界
        if(nums.length == 1 ) return nums[0];
        //分情况讨论偷或者不偷偷第一个位置
        //偷第一个位置的情况
        //切分原数组
        int n = nums.length - 1;
        int[] newNums1 = Arrays.copyOfRange(nums,0,nums.length-1);
        int ret1 = rob1(newNums1);
        //不偷第一个位置的情况
        int[] newNums2 = Arrays.copyOfRange(nums,1,nums.length);
        int ret2 = rob1(newNums2);
        return Math.max(ret1,ret2);
    }
    public int rob1(int[] nums) {
        //构造dp数组
        int n = nums.length;
        int[] f = new int[n];
        int[] g = new int[n];
        //处理边界条件
        if(n == 0) return 0;
        //对dp数组进行初始化
        f[0] = 0;
        g[0] = nums[0];
        //状态转移
        for(int i = 1;i < n;i++){
            g[i] = nums[i] + f[i-1];
            f[i] =  Math.max(g[i-1],f[i-1]);
        }
        return Math.max(f[n-1],g[n-1]);
    }
}
