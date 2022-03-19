package sort;

public class SortTest {
    public static void main(String[] args) {
        int n = 50000;
        int[] arr = SortHelper.generateRandomArray(n,0,Integer.MAX_VALUE);
        int[] arrCopy1 = SortHelper.arrCopy(arr);
        int[] arrCopy2 = SortHelper.arrCopy(arr);
        SortHelper.testSort("selectionSort",arr);
        SortHelper.testSort("bubbleSort",arrCopy1);
        SortHelper.testSort("selectionSortOP",arrCopy2);
    }
}