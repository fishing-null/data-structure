package prefix;

public class Lcr012 {
    public static void main(String[] args) {
        Lcr012 lcr012 = new Lcr012();
        lcr012.pivotIndex(new int[] {-1,-1,0,1,1,0});

    }
    public int pivotIndex(int[] nums) {
        int numsLength = nums.length;
        int[] preFix = new int[numsLength + 1];
        //构造前缀和数组
        for (int i = 1; i < numsLength + 1; i++) {
            preFix[i] = preFix[i - 1] + nums[i - 1];
        }
        for (int i = 0; i < numsLength; i++) {
            int leftSum = preFix[i];
            int rightSum = preFix[numsLength] - preFix[i + 1];
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
