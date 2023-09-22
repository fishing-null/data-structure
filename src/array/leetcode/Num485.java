package array.leetcode;

public class Num485 {
    public static void main(String[] args) {
        Num485 num485 = new Num485();
        num485.findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1});

    }
    public int findMaxConsecutiveOnes(int[] nums) {
//        int max = 0;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 1){
//                count++;
//                max = Math.max(count,max);
//            }else {
//                count = 0;
//            }
//        }
//        return max;
        int left=0,right=0;
        int count=0,max=0;
        while (right < nums.length){
            if(nums[right] == 1){
                right++;
                count++;
                max = Math.max(count,max);
            }else{
                count=0;
                left = ++right;
                right = left;
            }
        }
        return max;
    }
}
