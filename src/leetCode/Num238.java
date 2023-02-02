package leetCode;

public class Num238 {
    public static void main(String[] args) {
        Num238 num238 = new Num238();
        num238.productExceptSelf(new int[] {1,2,3,4});

    }
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        postfix[nums.length-1] = 1;
        prefix[0] = 1;
        int[] ans = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        for (int i = nums.length-2; i >= 0 ; i--) {
            postfix[i] = postfix[i+1]*nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix[i]*postfix[i];
        }
        return ans;
    }
}
