package SeqLIst;


import java.util.Arrays;

public class MyArray {
    private int[] data;
    private int size;
    public MyArray(){
        data = new int[10];
    }
    public MyArray(int capacity){
        data = new int[capacity];
    }

    private void grow(){
        int[] newData = Arrays.copyOf(this.data,this.data.length << 1);
        this.data=newData;
    }
    public String toString(){
        String ret ="[";
        for (int i = 0; i < size; i++) {
            ret += data[i];
            if(i != size - 1){
                ret += ",";
            }
        }
        ret+="]";
        return ret;
    }

    //动态数组的增加功能
    public void addFirst(int value){
        addIndex(0,value);
    }
    public void addLast(int value){
        addIndex(size,value);
    }
    public void addIndex(int index,int value){
        if(index < 0 || index>size){
            System.out.println("输入错误，请重新输入！");
            return;
        }
        if(size == data.length){
            grow();
        }
        for (int i = size-1; i >= index ; i--) {
            data[i+1]=data[i];
        }
        data[index]=value;
        size++;
    }
    //动态数组的删除功能
    public void removeIndex(int index){
        for (int i = index; i < size-1; i++) {
            data[i]=data[i+1];
        }
        size--;
        data[size] = 0;
    }
    public void removeAllValue(int value){
        for (int i = 0 ; i <size ; i++) {
            while(data[i] == value && i!=size){
                removeIndex(i);
            }
        }
    }
    //动态数组的查找功能
    public boolean contains(int value){
        for (int i = 0; i < size; i++) {
            if(data[i] == value){
                return true;
            }
        }
        return false;
    }
    //根据下标，找到一个数
    public int get(int index){
        if(index>=size || index < 0){
            System.out.println("输入错误，请重新输入！");
            return -1;
        }
        return data[index];
    }
    //找到一个数，并返回他的下标，如果没找到，则返回-1
    public int getbyValue(int value){
        for (int i = 0; i < size; i++) {
            if(data[i] == value){
                return i;
            }
        }
        return -1;
    }
    //根据下标改动一个数
    public void set(int index,int newValue){
        data[index] = newValue;
    }










}

