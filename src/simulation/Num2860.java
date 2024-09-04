package simulation;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Num2860 {
    public static void main(String[] args) {

    }
    public int countWays(List<Integer> nums) {
        int n = nums.size();
        int ret = 0;
        //对数组排序,利用有序的性质简化时间复杂度
        Collections.sort(nums);
        for (int i = 0; i <= n; i++) {
            //选中的最大值应该小于其下标
            //否则跳过
            if(i > 0 && nums.get(i-1) >= i){
                continue;
            }
            //未选中的最小值应该大于其下标
            //否则跳过
            if(i < n && nums.get(i) <= i){
                continue;
            }
            //能够正确选中
            ret++;
        }
        return ret;
    }
}
