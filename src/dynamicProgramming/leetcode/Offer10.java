package dynamicProgramming.leetcode;

import java.util.ArrayList;

public class Offer10 {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int[] F = new int[n+1];
        F[0] = 0;
        F[1] = 1;
        for(int i = 2;i<n+1;i++){
            F[i] = (F[i-1] + F[i-2])%1000000007;
        }
        return F[n];
    }
}
