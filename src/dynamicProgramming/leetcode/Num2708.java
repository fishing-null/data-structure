package dynamicProgramming.leetcode;

public class Num2708 {
    public static void main(String[] args) {
        Num2708 num2708 = new Num2708();
        num2708.maxStrength(new int[] {3,-1,-5,2,5,-9});

    }
    public long maxStrength(int[] nums) {
        //动态数组,dp1[i]表示取第i个学生时,小组的最大实力值
        long[] dp1 = new long[nums.length + 1];
        //动态数组,dp1[i]表示取第i个学生时,小组的最小实力值
        long[] dp2 = new long[nums.length + 1];
        //init
        dp1[0] = 1;
        dp2[0] = 1;
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length + 1; i++) {
            dp1[i] = Math.max(dp1[i-1],Math.max(dp2[i-1]*nums[i-1],dp1[i-1]*nums[i-1]));
            dp2[i] = Math.min(dp2[i-1],Math.min(dp1[i-1]*nums[i-1],dp2[i-1]*nums[i-1]));
            max = Math.max(max,dp1[i]);
            min = Math.min(min,dp2[i]);
        }
        return max;
    }
}
