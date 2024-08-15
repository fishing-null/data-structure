package dynamicProgramming.nowcoder;

public class BM78 {
    public static void main(String[] args) {

    }
    public int rob (int[] nums) {
        // write code here
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
