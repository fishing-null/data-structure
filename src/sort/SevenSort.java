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
    //直接插入排序
    //将整个区间分为已排序区间[0,i]和无序区间[i,n]
    //每次从无序区间中拿第一个元素插入到已排序区间的合适位置 使整个数组有序
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            //待排序区间第一个元素arr[i]
            for (int j = i; j >0; j--) {
                if(arr[j] > arr[j-1]){
                    break;
                }else{
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void insertionSortBS(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int left = 0;
            int right = i;
            while(left<right){
                int mid = (left) + ((right-left)>>1);
                if(val<arr[mid]){
                    right = mid;
                }else {
                    left = mid+1;
                }
            }
            //插入完 元素右移
            for (int j = i; j > left ; j--) {
                arr[j] = arr[j-1];
            }
            arr[left] = val;
        }
    }
    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
