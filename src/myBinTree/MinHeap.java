package myBinTree;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MinHeap {
    private List<Integer> data;
    public MinHeap(){
        this(10);
    }
    public MinHeap(int size){
        data = new ArrayList<>(size);
    }
    public MinHeap(int[] arr){
        data = new ArrayList<>(arr.length);
        for(int i:arr){
            data.add(i);
        }
        for (int i = parent(data.size()-1); i >=0 ; i--) {
            siftDown(i);
        }
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
    private boolean less(int i,int j ){return data.get(i).compareTo(data.get(j))<0; }
    private void siftUp(int k){
        while(parent(k)>0 && less(k,parent(k)) ){
            swap(k,parent(k));
            k=parent(k);
        }
    }
    private void siftDown(int k){
        //合法性校验
        while(leftChild(k) < data.size()){
            int j = leftChild(k);
            if(j+1 < data.size() && less(j,j+1)){
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
    public void add(int val){
        data.add(val);
        siftUp(data.size()-1);
    }
    public int extractMin(){
        if(isEmpty()){
            throw new NoSuchElementException("heap is empty!cannot extract!");
        }
        int min = data.get(0);
        swap(data.size()-1,0 );
        data.remove(data.size()-1);
        siftDown(0);
        return min;
    }
    public int peekMin(){
        if(isEmpty()){
            throw new NoSuchElementException("heap is empty!con not peek!");
        }
        return data.get(0);
    }
    @Override
    public String toString() {
        return data.toString();
    }

    private void swap(int i, int j) {
        int temp = data.get(i);
        data.set(i,data.get(j));
        data.set(j,temp);
    }
}
