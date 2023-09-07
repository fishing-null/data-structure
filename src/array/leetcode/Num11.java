package array.leetcode;

public class Num11 {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int left = 0,right = height.length - 1;
        int volume = Math.min(height[right],height[left])*(right-left);
        while (left < right){
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            volume = Math.max(volume,Math.min(height[right],height[left])*(right-left));
        }
        return volume;
    }
}
