package array.nowcoder;

import java.util.Scanner;

public class SortSubseries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int count = 0;
        while(i<n){
            if(arr[i]<arr[i+1]){
                while(i<n && arr[i] < arr[i+1]){
                    i++;
                }
                count++;
                i++;
            }else if(i<n && arr[i] == arr[i+1]){
                i++;
            }else{
                while(i<n && arr[i] > arr[i+1]){
                    i++;
                }
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
