package array.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num15 {
    public static void main(String[] args) {

        threeSum(new int[ ] {0,0,0});
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            //跳过重复元素
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            List<List<Integer>> tmp = twoSum(nums,i+1, nums.length-1,-nums[i],nums[i]);
            for(List<Integer> list:tmp){
                ret.add(list);
            }
        }
        return ret;
    }
    public static List<List<Integer>> twoSum(int[] nums,int start,int end,int target,int value){
        List<List<Integer>> ret = new ArrayList<>();
        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(value);
                tmp.add(nums[start]);
                tmp.add(nums[end]);
                ret.add(tmp);
                while (start < end && nums[start] == nums[start+1]){
                    //避免重复
                    start++;
                }
                start++;
                while (start < end && nums[end] == nums[end-1]){
                    //避免重复
                    end--;
                }
                end--;
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return ret;
    }
}
