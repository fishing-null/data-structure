package dynamicProgramming.leetcode;

public class Num2708 {
    public static void main(String[] args) {
        Num2708 num2708 = new Num2708();
        System.out.println(num2708.maxStrength(new int[] {-9}));
    }
    public long maxStrength(int[] nums) {
        //动态数组,dp1[i]表示取第i+1个学生时,小组的最大实力值
        //ex dp1[0]表示取第1个学生时,小组实力能够达到的最大值
        long[] dp1 = new long[nums.length];
        //动态数组,dp2[i]表示取第i+1个学生时,小组的最小实力值
        long[] dp2 = new long[nums.length];
        //init
        dp1[0] = nums[0];
        dp2[0] = nums[0];
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        if(nums.length == 1) return nums[0];
        for (int i = 1; i < nums.length; i++) {
            //状态转移,可能有两种状态
            //从最大->最小  记为mi Math.min(dp2[i-1],Math.min(dp1[i-1]*nums[i],dp2[i-1]*nums[i]))
            //从最小->最大  记为ma Math.max(dp1[i-1],Math.max(dp2[i-1]*nums[i],dp1[i-1]*nums[i]))
            dp2[i] = Math.min(Math.min(dp2[i-1],Math.min(dp1[i-1]*nums[i],dp2[i-1]*nums[i])),nums[i]);
            //和之前的状态比较取最大值或最小值 Math.min(mi,nums[i]) or Math.max(ma,nums[i])
            //对于dp2取Min，对于dp1取Max
            dp1[i] = Math.max(Math.max(dp1[i-1],Math.max(dp2[i-1]*nums[i],dp1[i-1]*nums[i])),nums[i]);
            max = Math.max(max,dp1[i]);
            min = Math.min(min,dp2[i]);
        }
        return max;
    }
}
