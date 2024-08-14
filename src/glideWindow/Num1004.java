package glideWindow;

public class Num1004 {
    public static void main(String[] args) {
        Num1004 num1004 = new Num1004();
        num1004.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2);

    }
    public int longestOnes(int[] nums, int k) {
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
