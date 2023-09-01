package math.leetcode;

public class Num2240 {
    public static void main(String[] args) {

    }
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ret = 0,count = 0;
        if(cost1 < cost2){
            return waysToBuyPensPencils(total,cost2,cost1);
        }
        while(count * cost1 <= total){
            ret += (total - count*cost1) / cost2 + 1;
            count++;
        }
        return ret;
    }
}
