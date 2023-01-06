package math.leetcode;

public class Num2180 {
    public int countEven(int num) {
        int count = 0;
        if(num == 0){
            return 0;
        }
        if(isOdd(num)){
            return countEven(num-1)+1;
        }else{
            return countEven(num-1);
        }
    }
    public boolean isOdd(int num){
        int count = 0;
        while(num>0){
            count += num%10;
            num = num/10;
        }
        if(count%2 == 0){
            return true;
        }
        return false;
    }
}
