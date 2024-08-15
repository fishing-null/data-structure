package twoPointer;

public class BM93 {
    public static void main(String[] args) {

    }
    public int maxArea (int[] height) {
        // write code here
        //小于2不构成容器,直接返回0
        int ret = 0;
        if(height.length < 2) return ret;
        int left = 0,right = height.length - 1;
        while (left < right){
            ret = Math.max(ret,(right - left)*Math.min(height[left],height[right]));
            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ret;
    }
}
