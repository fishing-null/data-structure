package leetCode;

import java.util.*;

public class Num373 {
    private class Pair{
        int k;
        int v;
        public Pair(int k,int v){
            this.k = k;
            this.v = v;
        }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<Pair> queue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return (o2.k+o2.v)-(o1.k+o1.v);
            }
        });
        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            for (int j = 0; j < Math.min(k,nums2.length); j++) {
                if(queue.size() < k){
                    queue.offer(new Pair(nums1[i],nums2[j]));
                }else{
                    int add = nums1[i] + nums2[j];
                    Pair pair = queue.peek();
                    if(add > pair.k+ pair.v){
                        continue;
                    }else{
                        queue.poll();
                        queue.add(new Pair(nums1[i],nums2[j]));
                    }
                }
            }
        }
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < k &&(!queue.isEmpty()); i++) {
            List<Integer> tmp = new ArrayList<>();
            Pair pair = queue.poll();
            tmp.add(pair.k);
            tmp.add(pair.v);
            ret.add(tmp);
        }
        return ret;
    }
}
