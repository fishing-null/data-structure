package hash.leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        while(true){
            if(f2 == n){
                System.out.println("0");
            }else if(f2 > n){
                if(Math.abs(f2 - n)> Math.abs(f1 - n)){
                    System.out.println(Math.abs(f1 - n));
                }
                else{
                    System.out.println(Math.abs(f2 - n));
                }
                break;
            }
            int tmp = f2+f1;
            f1 = f2;
            f2 = tmp;
        }
    }

}
