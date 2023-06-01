package greedyAlgorithm.leetcode;

import java.util.Arrays;

public class Num2517 {
    public static void main(String[] args) {

    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int left = 0, right = price[price.length - 1] - price[0];
        while (left < right){
            int mid = (left+right+1)/2;
            if(check(price,k,mid)){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    public boolean check(int[] price,int k,int tastiness){
        int prev =  Integer.MIN_VALUE / 2;
        int count = 0;
        for(int p:price){
            if(p - prev >= tastiness){
                count++;
                prev = p;
            }
        }
        return count >= k;
    }
}
