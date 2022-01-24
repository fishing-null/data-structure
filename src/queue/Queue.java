package queue;
//链表的接口 包含以下四个核心操作
/*
1.入队 offer
2.出队 poll
3.返回队首元素 peek
4.判断队列是否为空 isEmpty
 */
public interface Queue <E>{
    void offer(E val);
    E poll();
    E peek();
    boolean isEmpty();
}
