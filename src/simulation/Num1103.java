package simulation;

public class Num1103 {
    public static void main(String[] args) {

    }
    public int[] distributeCandies(int candies, int num_people) {
        //构造返回数组
        int[] ret = new int[num_people];
        int i = 0;
        //记录需要的糖果数
        int count = 1;
        while(candies > 0){
            if(candies < count){
                ret[i++] += candies;
            }else{
                ret[i++] += count;
            }
            candies -= count;
            count++;
            i %= num_people;
        }
        return ret;
    }
}
