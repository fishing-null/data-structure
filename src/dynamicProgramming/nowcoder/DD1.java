package dynamicProgramming.nowcoder;

import java.util.Scanner;

public class DD1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int sum = arr[0];
        int max = arr[0];
        for(int i = 1;i<size;i++){
            sum = Math.max(sum+arr[i],arr[i]);
        }
        System.out.println(sum);
    }
}
