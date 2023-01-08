package greedyAlgorithm.leetcode;

public class Num11 {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
         int left = 0;
         int right = height.length-1;
         int maxArea = 0;
         while(left < right){
             int area = Math.min(height[left],height[right])*(right-left);
             if(height[left] < height[right]){
                 left++;
             }else{
                 right--;
             }
             maxArea = Math.max(maxArea,area);
         }
         return maxArea;
    }
}
