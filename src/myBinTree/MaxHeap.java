package myBinTree;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxHeap {
    List<Integer> data;
    public MaxHeap(){
        this(10);
    }
    public MaxHeap(int size){
        data = new ArrayList<>(size);
    }
    public MaxHeap(int[] arr){
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
    private boolean more(int i,int j){return data.get(i).compareTo(data.get(j)) >= 0;}
    public void add(int k){
        data.add(k);
        siftUp(data.size()-1);
    }
    private void siftUp(int k){
        while(k>0 && more(k,parent(k))){
            swap(k,parent(k));
            k=parent(k);
        }
    }
    private void siftDown(int k){
        while(leftChild(k)< data.size()){
            int j = leftChild(k);
            if(j+1< data.size() && data.get(j)< data.get(j+1)){
                j=j+1;
            }
            if(more(k,j)){
                break;
            }else{
                swap(k,j);
                k=j;
            }
        }
    }
    public int extractMax(){
        if(isEmpty()){
            throw new NoSuchElementException("heap is empty!cannot extract!");
        }
        swap(data.size()-1,0);
        int max = data.get(data.size()-1);
        data.remove(data.size()-1);
        siftDown(0);
        return max;
    }
    public int peekMax(){
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
