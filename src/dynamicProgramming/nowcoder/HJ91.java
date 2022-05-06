package dynamicProgramming.nowcoder;

import java.util.Scanner;

public class HJ91 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(med(n,m));
        }
    }
    private static int med(int n,int m){
        if((n == 1 && m >= 1) || (m == 1 && n >= 1)){
            return m+n;
        }
        return med(n-1,m)+med(m-1,n);
    }
}
