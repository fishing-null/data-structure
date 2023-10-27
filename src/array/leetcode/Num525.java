package array.leetcode;

public class Num525 {
    public static void main(String[] args) {
        Num525 num525 = new Num525();
        num525.findMaxLength(new int[] {0,1});

    }
    public int findMaxLength(int[] nums) {
        //1.超时
//        int ret = 0;
//        for(int i = 0;i < nums.length;i++){
//            if(nums[i] == 0){
//                nums[i] = -1;
//            }
//        }
//        int sum;
//        for(int i = 0;i < nums.length;i++){
//            sum = 100001;
//            for(int j = i ; j >= 0 ; j--){
//                sum += nums[j];
//                if(sum == 100001){
//                    ret = Math.max(ret,i - j + 1);
//                }
//            }
//        }
//        return ret;
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
            if(prefixSum[i] == 0){
                ret = Math.max(ret,i+1);
            }
        }
        return ret;
    }
}
