package simulation;

import java.util.Arrays;

public class Num2028 {
    public static void main(String[] args) {
        Num2028 num2028 = new Num2028();

        System.out.println(num2028.missingRolls(new int[] {1,2,3,4},6,4));
    }
    public int[] missingRolls(int[] rolls, int mean, int n) {
        //使用ret数组保存结果
        int[] ret = new int[n];
        Arrays.fill(ret,1);
        //求出值的总和
        int sum = (rolls.length + n) * mean;
        //求出差值
        int diff = sum;
        for (int i = 0; i < rolls.length; i++) {
            diff -= rolls[i];
        }
        //处理边界
        if(diff > n*6 || diff < n*1) return new int[] {};
        diff -= n;
        while (diff > 0){
            for (int i = 0; i < ret.length; i++) {
                if(ret[i] < 6){
                    ret[i]++;
                    diff--;
                    if(diff == 0) break;;
                }
                i %= ret.length;
            }
        }
        return ret;
    }
}
