package dynamicProgramming.leetcode;

import java.util.Arrays;
import java.util.Collection;

public class Num673 {
    public static void main(String[] args) {
        System.err.println("a");

    }
    public int findNumberOfLIS(int[] nums) {
        //创建dp数组
        int n = nums.length;
        //统计下标为i结尾的所有子序列中，最长递增子序列长度
        int[] length = new int[n];
        //统计下标为i结尾的所有子序列中，最长递增子序列个数
        int[] count = new int[n];
        //初始化
        Arrays.fill(length,1);
        Arrays.fill(count,1);
        int retLength = 1;
        int retCount = 1;
        //状态转移
        for(int i = 1;i < n;i++){
            for(int j = 0; j < i;j++){
                if(nums[j] < nums[i]){
                    if(length[j] + 1 == length[i]) count[i] += count[j];
                    else if(length[j] + 1 > length[i]) {
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    }
                }
            }
            if(retLength == length[i]) retCount += count[i];
            else if(retLength < length[i]) {
                retLength = length[i];
                retCount = count[i];
            }
        }
        return retCount;
    }
}
