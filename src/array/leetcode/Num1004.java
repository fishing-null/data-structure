package array.leetcode;

public class Num1004 {
    public static void main(String[] args) {
        Num1004 num1004 = new Num1004();
        num1004.longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3);

    }
    public int longestOnes(int[] nums, int k) {
        //暴力法
//        int ret = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int len = 0,count = 0;
//            for (int j = i; j < nums.length; j++) {
//                if(count >= k && nums[j] == 0){
//                    break;
//                }else if(nums[j] == 0 && count < k){
//                    len++;
//                    count++;
//                }else{
//                    len++;
//                }
//                ret = Math.max(ret,len);
//            }
//        }
//        return ret;
        int left=0,right=0;
        int ret = 0;
        int count =0;
        while (right < nums.length){
            if(nums[right] == 0){
                count++;
            }
            right++;
            while (count > k){
                if(nums[left] == 0){
                    count--;
                }
                left++;
            }
            ret = Math.max(ret,right-left);
        }
        return ret;
    }
}
