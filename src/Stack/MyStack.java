package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyStack <E>{
    //用来存储栈中元素的个数
    private int size = 0;
    //基于动态数组来实现顺序栈
    private List<E> data = new ArrayList<>();

    public void push (E val){
        data.add(val);
        size++;
    }

    public E pop(){
        if(isEmpty()){
            throw new NoSuchElementException("stack is empty!can not pop!");
        }
        E val = data.remove(size-1);
        size--;
        return val;
    }

    public E peek(){
        if(isEmpty()){
            throw new NoSuchElementException("stack is empty!can not peek!");
        }
        E val = data.get(size-1);
        return val;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < size; i++) {
            sb.append(data.get(i));
            if(i != size-1){
                sb.append(",");
            }
        }
        sb.append("} top");
        return sb.toString();
    }
}
