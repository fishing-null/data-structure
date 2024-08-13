package array.leetcode;

public class Num3151 {
    public static void main(String[] args) {

    }
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;
        boolean flag1 = false;
        if(nums[0] % 2 == 0) flag1 = true;
        for(int i = 1;i < nums.length;i++){
            //判断奇偶性
            if(flag1 == true){
                //此时该是奇数
                if(nums[i] % 2 == 1){
                    flag1 = false;
                    continue;
                }else{
                    return false;
                }
            }else if(flag1 == false){
                if(nums[i] % 2 == 0){
                    flag1 = true;
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
