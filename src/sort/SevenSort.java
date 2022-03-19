package sort;

public class SevenSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }
    public static void selectionSortOP(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int min = low;
            int max = low;
            for (int i = low+1; i <= high; i++) {
                if(arr[i]<arr[min]){
                    min = i;
                }
                if(arr[i]>arr[max]){
                    max = i;
                }
            }
            swap(arr,low,min);
            if(max == low){
                max = min;
            }
            swap(arr,max,high);
            low += 1;
            high -= 1;
        }
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //如果flag为true,说明此次循环没有发生交换 数组已经有序
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
