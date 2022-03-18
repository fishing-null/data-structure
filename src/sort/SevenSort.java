package sort;

public class SevenSort {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //如果flag为true,说明此次循环没有发生交换 数组已经有序
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]){
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
        arr[j] = arr[j+1];
        arr[j+1] = tmp;
    }
}
