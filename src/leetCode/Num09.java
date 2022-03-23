package leetCode;

public class Num09 {
    public static void main(String[] args) {
        isPalindrome(2147483647);
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        //个位数直接返回true
        if(x>=0&&(x/10==0)){
            return true;
        }
        //记录数字位数
        int count = 0;
        for (int i = x; i >0;) {
            count++;
            i /= 10;
        }
        long ret = 0;
        //逆序重新拼凑数字
        for (int i = x; i > 0 ;) {
            int num = i%10;
            i /= 10;
            ret += num*Math.pow(10,count-1);
            count--;
        }
        //检查是否相等
        if(ret == x){
            return true;
        }
        return false;
    }
}
