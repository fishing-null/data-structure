package Leetcode;

public class Num260 {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,2,5};
        int[] ret=singleNumber(nums);
        for(int i : ret){
            System.out.println(i);
        }
    }

    public static int[] singleNumber(int[] nums) {
        int eor = 0;
        //假设两个出现一次的数字是a b
        //此时eor=a^b
        for(int num:nums){
            eor ^= num;
        }
        //a b一定有一位不相同
        //找到eor二进制中最先出现的1(不相同的呢一位)
        //根据这一位将数组分类为a类 和 b类
        int rightOne = eor&(~eor+1);
        int a=0;
        for(int cur:nums){
            if((cur & rightOne)==rightOne){
                a ^= cur;
            }
        }
        int b = a^eor;
        int[] arr =  {a,b};
        return arr;
    }
}
