package math.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num1630 {
    public static void main(String[] args) {
        Num1630 num1630 = new Num1630();
        int[] nums = new int[]{4,6,5,9,3,7};

        num1630.checkArithmeticSubarrays(nums,new int[] {0,0,2},new int[] {2,3,5});
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            if(isArithmeticSubayyays(nums,l[i],r[i])){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }

    private boolean isArithmeticSubayyays(int[] nums, int l, int r) {
        int[] resortNums = new int[r-l+1];
        for (int i = l,j = 0; i <= r; i++,j++) {
            resortNums[j] = nums[i];
        }
        Arrays.sort(resortNums);
        int flag = resortNums[1]-resortNums[0];
        for (int i = 1; i < resortNums.length-1; i++) {
            int tmp = resortNums[i+1]-resortNums[i];
            if(tmp == flag){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
