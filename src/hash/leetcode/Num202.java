package hash.leetcode;

public class Num202 {
    public boolean isHappy(int n) {
        int fast = n;
        int low = n;
        do{
            low = fun(low);
            fast = fun(fast);
            fast = fun(fast);
        }while(low != fast);
        if(fast == 1){
            return true;
        }
        return false;
    }
    public int fun(int n){
        int tmp = 0;
        while(n!=0){
            tmp += Math.pow(n%10,2);
            n = n/10;
        }
        return tmp;
    }
}
