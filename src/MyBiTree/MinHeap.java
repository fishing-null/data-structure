package MyBiTree;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> data;
    public MinHeap(){
        this(10);
    }
    public MinHeap(int size){
        data = new ArrayList<>(size);
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
    private void siftUp(int k){
        while(parent(k)>0 && data.get(k)<data.get(parent(k)) ){
            swap(data.get(k),data.get(parent(k)));
            k=parent(k);
        }
    }
    private void siftDown(int k){
        while(leftChild(k) < data.size()){
            int j = leftChild(k);
            if(j+1 < data.size() && data.get(j+1) < data.get(j)){
                j = j+1;
            }
            if(data.get(j) >= data.get(k)){
                break;
            }else{
                swap(k,j);
                k = j;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = data.get(i);
        data.set(i,data.get(j));
        data.set(j,temp);
    }
}
