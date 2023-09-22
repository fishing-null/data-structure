package array.nowcoder;

public class BM92 {
    public static void main(String[] args) {
        BM92 bm92 = new BM92();
        bm92.maxLength(new int[] {2,2,3,4,8,99,3});
        System.out.println(bm92.maxLength(new int[] {1,1,3,4,9,7,9,4,8,4}));

    }
    public int maxLength (int[] arr) {
        // write code here
        int[] index = new int[100001];
        int ret = 0;
        for (int left = 0,right = 0; right < arr.length; right++) {
            index[arr[right]]++;
            while (index[arr[right]] > 1){
                index[arr[left]]--;
                left++;
            }
            ret = Math.max(ret,right-left+1);
        }
        return ret;
    }
}
