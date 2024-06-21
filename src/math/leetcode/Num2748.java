package math.leetcode;

public class Num2748 {
    public static void main(String[] args) {

    }
    public int countBeautifulPairs(int[] nums) {
        int ret = 0,numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            while (nums[i] >= 10){
                //求数字的第一位
                nums[i] /= 10;
            }
            for (int j = i+1; j < numsLength; j++) {
                if(gcd(nums[i],nums[j] % 10) == 1) ret++;
            }
        }
        return ret;
    }
    private int gcd(int x,int y){
        return y == 0 ? x : gcd(y,x % y);
    }
}
