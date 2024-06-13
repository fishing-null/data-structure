package dynamicProgramming.leetcode;

public class Num978 {
    public static void main(String[] args) {

    }
    public int maxTurbulenceSize(int[] arr) {
        //定义dp数组
        int dpLength = arr.length;
        //记录以i为结尾的所有子数组中末尾呈现"上升"状态的最大湍流子数组长度
        int[] dp1 = new int[dpLength];
        //记录以i为结尾的所有子数组中末尾呈现"下降"状态的最大湍流子数组长度
        int[] dp2 = new int[dpLength];
        //初始化
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        //状态转移
        int ret = 1;
        for(int i = 1;i < dpLength;i++){
            if(arr[i] > arr[i-1]) dp1[i] = dp2[i-1] + 1;
            else if(arr[i] < arr[i-1]) dp2[i] = dp1[i-1] + 1;
            ret = Math.max(ret,Math.max(dp1[i],dp2[i]));
        }
        return ret;
    }
}
