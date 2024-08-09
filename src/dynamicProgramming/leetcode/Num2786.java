package dynamicProgramming.leetcode;

public class Num2786 {
    public static void main(String[] args) {
        Num2786 num2786 = new Num2786();
        num2786.maxScore(new int[] {2,3,6,1,9,2},5);
    }
    public long maxScore(int[] nums, int x) {
        //创建dp数组
        int dpLength = nums.length;
        long[] dp = new long[dpLength];
        long odd,even;
        //初始化dp数组
        if(nums[0] % 2 == 0){
            even = nums[0];
            odd = nums[0] - x;
        }else{
            odd = nums[0];
            even = nums[0] - x;
        }
        //
        dp[0] = nums[0];
        //状态转移
        long ret = nums[0];
        for(int i = 1;i < dpLength;i++){
            if(nums[i] % 2 == 0){
                //i为偶数
                even = Math.max(even + nums[i] , odd - x + nums[i]);
                dp[i] = Math.max(ret,even);
            }else{
                //i为奇数
                odd = Math.max(odd + nums[i],even - x + nums[i]);
                dp[i] = Math.max(ret,odd);
            }
            ret = Math.max(dp[i],ret);
        }
        return ret;
    }
}
