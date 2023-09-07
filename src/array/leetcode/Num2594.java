package array.leetcode;

public class Num2594 {
    public static void main(String[] args) {
        Num2594 num2594 = new Num2594();
        num2594.repairCars(new int[] {4,2,3,1},10);

    }
    public long repairCars(int[] ranks, int cars) {
        long left = 1,right = 1l*ranks[0] * cars * cars;
        while (left < right){
            long m = (left + right) >> 1;
            if(checkFixedCar(ranks,cars,m)){
                right = m;
            }else {
                left = m + 1;
            }
        }
        return left;
    }
    public boolean checkFixedCar(int[] ranks,int cars,long m){
        long count = 0;
        for(int x:ranks){
            count += (long) Math.sqrt(m / x);
        }
        return count >= cars;
    }
}
