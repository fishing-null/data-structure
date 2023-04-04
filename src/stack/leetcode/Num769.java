package stack.leetcode;

public class Num769 {
    public static void main(String[] args) {

    }
    public int maxChunksToSorted(int[] arr) {
        int count = 0;
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            count = Math.max(count,arr[i]);
            if(count == i){
                ret++;
            }
        }
        return ret;
    }
}
