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
    public static void mergeSort(int[] arr){
        mergeSortInternal(arr,0,arr.length-1);
    }
    //在区间arr[l,r]上进行归并排序
    private static void mergeSortInternal(int[] arr, int l, int r) {
        if(r - l <= 15){
            insertionSort(arr,l,r);
            return;
        }
        int mid = l+((r-l)>>1);
        //将原数组拆分成左右两个区间 分别进行归并排序
        mergeSortInternal(arr,l,mid);
        mergeSortInternal(arr,mid+1,r);
        if(arr[mid] > arr[mid+1]){
            merge(arr,l,mid,r);
        }
    }

    private static void insertionSort(int[] arr, int l, int r) {
        for (int i = l+1; i <= r; i++) {
            for (int j = i; j > l && arr[j] < arr[j-1] ; j--) {
                swap(arr,j,j-1);
            }
        }
    }

    //合并两个子数组为一个大的有序数组
    private static void merge(int[] arr, int l, int mid, int r) {
        //创建一个临时数组aux
        int[] aux = new int[r - l + 1];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = arr[i+l];
        }
        //左侧小数组的开始索引
        int i = l;
        //右侧小数组的开始索引
        int j = mid+1;
        for (int k = l; k <= r; k++) {
            if(i > mid){
                arr[k] = aux[j-l];
                j++;
            }else if(j > r){
                arr[k] = aux[r-l];
                i++;
            }else if(aux[i - l]<=aux[j - l]){
                arr[k] = aux[i-l];
                i++;
            }else{
                arr[k] = aux[j-l];
                j++;
            }
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
    //将整个区间分为已排序区间[0,i)和无序区间[i,n]
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
    public static void shellSort(int[] arr){
        //预处理阶段
        int gap = arr.length>>1;
        while(gap > 1){
            insertionSortGap(arr,gap);
            gap = gap >> 1;
        }
        //整个集合接近有序 对整个集合排序
        insertionSort(arr);
    }

    private static void insertionSortGap(int[] arr, int gap) {
        for (int i = gap; i < arr.length; i++) {
            for (int j = i; j - gap >= 0 && arr[j] < arr[j-gap]; j -= gap) {
                swap(arr,j,j-gap);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
