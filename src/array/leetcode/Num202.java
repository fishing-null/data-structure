package array.leetcode;

public class Num202 {
    public static void main(String[] args) {
        Num202 num202 = new Num202();
        num202.isHappy(19);

    }
    public boolean isHappy(int n) {
        int low = n;
        int fast = findNext(low);
        while (fast != low){
            low = findNext(low);
            fast = findNext(fast);
            fast = findNext(fast);
        }
        return fast == 1;
    }
    public int findNext(int n ){
        int ret = 0;
        while (n > 0){
            int tmp = n % 10;
            ret += Math.pow(tmp,2);
            n /= 10;
        }
        return ret;
    }

}
