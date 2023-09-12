package glideWindow;

public class Num209 {
    public static void main(String[] args) {
        Num209 num209 = new Num209();
        num209.minSubArrayLen(7,new int[] {2,3,1,2,4,3});

    }
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0,right = 0,len = nums.length;
        int ret = Integer.MAX_VALUE,sum = nums[left];
        for(left = 0;left < len;left++){
            while (left <= right && right < len){
                if(sum >= target){
                    ret = Math.min(ret,right- left + 1);
                    sum -= nums[left];
                    break;
                }else if (right < len-1){
                    right++;
                    sum += nums[right];
                }else{
                    break;
                }
            }
        }
        return ret == Integer.MAX_VALUE ? 0 : ret;
    }
}
