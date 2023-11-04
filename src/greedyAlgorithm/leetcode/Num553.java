package greedyAlgorithm.leetcode;

public class Num553 {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        StringBuffer sb = new StringBuffer();
        if(nums.length == 1){
            sb.append(nums[0]);
            return sb.toString();
        }
        if(nums.length == 2){
            sb.append(nums[0]).append("/").append(nums[1]);
            return sb.toString();
        }
        sb.append(nums[0]).append("/").append("(");
        sb.append(")");
        return sb.toString();
    }
}
