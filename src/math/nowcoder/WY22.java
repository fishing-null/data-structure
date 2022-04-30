package math.nowcoder;

import java.util.Scanner;

public class WY22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        while(f2<n){
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        int ret = Math.min(n-f1,f2-n);
        System.out.println(ret);
    }
}
