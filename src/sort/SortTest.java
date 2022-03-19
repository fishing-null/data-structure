package sort;

public class SortTest {
    public static void main(String[] args) {
        int n = 50000;
        int[] sortArr = SortHelper.generateSortedArray(n,10);
        int[] arr = SortHelper.generateRandomArray(n,0,Integer.MAX_VALUE);
        int[] arrCopy1 = SortHelper.arrCopy(arr);
        int[] arrCopy2 = SortHelper.arrCopy(arr);
        int[] arrCopy3 = SortHelper.arrCopy(arr);
        int[] arrCopy4 = SortHelper.arrCopy(arr);
        SortHelper.testSort("selectionSort",arr);
        SortHelper.testSort("bubbleSort",arrCopy1);
        SortHelper.testSort("selectionSortOP",arrCopy2);
        SortHelper.testSort("insertionSort",arrCopy3);
        SortHelper.testSort("insertionSort",sortArr);
        SortHelper.testSort("insertionSortBS",arrCopy4);
    }
}
