package MyBiTree;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    List<Integer> data;
    public MaxHeap(int size){
        data = new ArrayList<>(size);
    }
    public MaxHeap(){
        this(10);
    }
    public boolean isEmpty(){
        return data.size() == 0;
    }
    private int parent(int k){
        return (k-1)>>1;
    }
    private int leftChild(int k){
        return (k<<1)+1;
    }
    private int rightChild(int k){
        return (k<<1)+2;
    }
    public void add(int k){
        data.add(k);
        siftUp(data.size()-1);
    }
    private void siftUp(int k){
        while(k>0 && data.get(k)>=data.get(parent(k))){
            swap(k,parent(k));
            k=parent(k);
        }
    }
    private void swap(int k, int parent) {
        int temp = k;
        k = parent;
        parent = temp;
    }
}
