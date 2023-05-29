package sort.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Num969 {
    public static void main(String[] args) {

    }
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ret = new ArrayList<>();
        for (int i = arr.length; i > 1; i--) {
            int index = 0;
            for (int j = 0; j < i; j++) {
                if(arr[i] >= arr[j]){
                    index = i;
                }
            }
            if(index == i-1){
                continue;
            }
            reverse(arr,index);
            reverse(arr,i-1);
            ret.add(index+1);
            ret.add(i);
        }
        return ret;
    }
    public void reverse(int[] arr,int end){
        for (int i = 0, j = end; i < j; i++,j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
