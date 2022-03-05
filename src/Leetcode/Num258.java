package Leetcode;

public class Num258 {
    public int addDigits(int num) {
        while(num>=10){
            num = fun(num);
        }
        return num;
    }
    public int fun(int num){
        if(num < 10){
            return num;
        }
        return fun(num/10)+num%10;
    }
}
