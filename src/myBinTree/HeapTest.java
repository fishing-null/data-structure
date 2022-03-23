package myBinTree;
public class HeapTest {
    public static void main(String[] args) {
        int[] data = {45,65,89,34,67,58,31,46,78};
        MaxHeap maxHeap = new MaxHeap(data);
        System.out.println(maxHeap);
        MinHeap minHeap = new MinHeap(data);
        System.out.println(minHeap);
    }
}
