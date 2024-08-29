package prefix;

public class Num238 {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefixAmass = new int[len];
        int[] suffixAmass = new int[len];
        int[] ret = new int[len];
        prefixAmass[0] = 1;
        suffixAmass[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            prefixAmass[i] = nums[i - 1] * prefixAmass[i-1];
        }
        for (int i = len - 2; i >= 0 ; i--) {
            suffixAmass[i] = nums[i + 1] * suffixAmass[i+1];
        }
        for (int i = 0; i < len; i++) {
            ret[i] = prefixAmass[i] * suffixAmass[i];
        }
        return ret;
    }
}
