package seqList;

import java.util.Arrays;

public class myArray2 {
    public int[] elem;
    public int usedSize;//0
    //默认容量
    private static final int DEFAULT_SIZE = 10;

    public myArray2() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表:
     *   根据usedSize判断即可
     */
    public void display() {
        StringBuffer sb = new StringBuffer();
        sb.append('[');
        for (int i = 0; i < usedSize; i++) {
            sb.append(elem[i]);
            if(i == usedSize-1){
                sb.append(']');
            }else{
                sb.append(',');
            }
        }
        System.out.println(sb.toString());
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        if(isFull()){
            grow();
        }
        elem[usedSize] = data;
        usedSize++;
    }

    /**
     * 判断当前的顺序表是不是满的！
     * @return true:满   false代表空
     */
    public boolean isFull() {
        return usedSize == elem.length;
    }


    private boolean checkPosInAdd(int pos) {
        if(pos < 0){
            return false;
        }
        if(pos > usedSize){
            return false;
        }
        return true;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(checkPosInAdd(pos)){
            if(isFull()){
                grow();
            }
            for (int i = usedSize; i > pos ; i--) {
                elem[i] = elem[i-1];
            }
        }
        elem[pos] = data;
        usedSize++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if(elem[i] == toFind){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if(elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        if (checkPosInAdd(pos)){
            return elem[pos];
        }
        return -1;
    }

    private boolean isEmpty() {
        return usedSize == 0;
    }
    // 给 pos 位置的元素设为【更新为】 value
    public void set(int pos, int value) {
        if(checkPosInAdd(pos)){
            elem[pos] = value;
        }
    }

    /**
     * 删除第一次出现的关键字key
     * @param key
     */
    public void remove(int key) {
        int index = 0;
        for (int i = 0; i < usedSize; i++) {
            if(elem[i] == key){
                index = i;
            }
        }
        for (int i = index; i < usedSize; i++) {
            elem[i] = elem[i+1];
        }
        usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        return  usedSize;
    }

    // 清空顺序表
    public void clear() {
        usedSize = 0;
    }
    public void grow(){
        if(isFull()){
            elem = Arrays.copyOf(elem,2*elem.length);
        }
    }

}
