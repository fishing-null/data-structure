package binary.nowcoder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class BM45 {
    public static void main(String[] args) {
        BM45 bm45 = new BM45();
        bm45.maxInWindows(new int[] {1,3,-1,-3,5,3,6,7},3);
    }
    public ArrayList<Integer> maxInWindows (int[] num, int size) {
        int n = num.length;
        int[] ans = new int[n - size + 1];
        ArrayList<Integer> ret = new ArrayList<>();
        //存贮下标 按照下标对应值大小排序
        Deque<Integer> q = new ArrayDeque<>();
        if(size == 0) return ret;
        for (int i = 0; i < n; i++) {
            //入队列
            while (!q.isEmpty() && num[q.getLast()] <= num[i]){
                q.removeLast();
            }
            q.addLast(i);
            //出队列
            //判断窗口大小
            if(i - q.getFirst() >= size){
                q.removeFirst();
            }
            if(i >= size - 1){
                ret.add(num[q.getFirst()]);
            }
        }
        return ret;
    }
}
