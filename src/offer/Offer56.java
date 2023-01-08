package offer;

public class Offer56 {
    public static void main(String[] args) {
        singleNumbers(new int[] {1,2,5,2});
    }
    public static int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret = nums[i]^ret;
        }
        int flag = 1;
        while((flag & ret) == 0){
            flag = flag << 1;
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if((flag & nums[i]) != 0){
                a ^= nums[i];
            }else{
                b ^= nums[i];
            }
        }
        return new int[]{a,b};
    }
}
