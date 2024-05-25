package array.leetcode;

public class Num2903 {
    public static void main(String[] args) {

    }
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        //定义返回数组,默认返回值为[-1,-1]
        int[] ret = new int[2];
        ret[0] = -1;
        ret[1] = -1;
        //
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                //先确认下标符合需求
                if(Math.abs(i-j) >= indexDifference ){
                    //再确认值符合需求
                    if(Math.abs(nums[i]-nums[j]) >= valueDifference){
                        //更新返回数组
                        ret[0] = i;
                        ret[1] = j;
                    }
                }
            }
        }
        //返回结果
        return ret;
    }
}
