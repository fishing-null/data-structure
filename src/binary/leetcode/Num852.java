package binary.leetcode;

public class Num852 {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0,right = arr.length - 1;

        while (left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] > arr[mid - 1]) left = mid;
            else right = mid - 1;
        }
        return left;
    }
}
