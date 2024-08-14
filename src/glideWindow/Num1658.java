package glideWindow;

public class Num1658 {
    public static void main(String[] args) {
        Num1658 num1658 = new Num1658();
        int ret = num1658.minOperations(new int[] {5},5);
        System.out.println(ret);

    }
    public int minOperations(int[] nums, int x) {
        int sum = 0,len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        sum -= x;
        //转变为子数组问题,寻找一个长度最长的子数组使其等于sum,找不到则返回-1;
        int left = 0,right = 0;
        int count = 0,ret = Integer.MIN_VALUE;

        if(sum == 0 ) return 1;
        while (right < len){
            //入窗口
            count += nums[right];
            //出窗口
            while(left < len - 1 && count > sum){
                count -= nums[left];
                left++;
            }
            if(count == sum){
                ret = Math.max(ret,right - left + 1);
            }
            right++;
        }
        return  ret == Integer.MIN_VALUE ? -1 : len - ret;
    }
}
