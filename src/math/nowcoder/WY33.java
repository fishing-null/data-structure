package math.nowcoder;

import java.util.Scanner;

public class WY33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int a = (A+C)/2;
        int b1 = (B+D)/2;
        int b2 = (C-A)/2;
        int c = (D-B)/2;
        if(b1 != b2){
            System.out.println("No");
        }else{
            System.out.println(a+" "+b1+" "+c);
        }
    }
}
