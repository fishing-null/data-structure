package array.leetcode;

public class Num161 {
    public static void main(String[] args) {

    }
    public boolean isOneEditDistance(String s, String t) {
        int m = s.length(),n = t.length();
        if(Math.abs(m-n) == 1 || Math.abs(n-m) == 1){
            if(m > n){
                return isOneInsert(s,t);
            }else{
                return isOneInsert(t,s);
            }
        }else if (m == n){
            boolean findDifference = false;
            for (int i = 0; i < m; i++) {
                if(s.charAt(i) != t.charAt(i)){
                    if(!findDifference){
                        findDifference = true;
                    }else{
                        return false;
                    }
                }
            }
            return findDifference;
        }else {
            //不属于以上三种情况
            return false;
        }
    }
    public boolean isOneInsert(String longer,String shorter){
        int shortLength = shorter.length(),longLength = longer.length();
        int shortIndex = 0,longIndex = 0;
        while (shortIndex < shortLength && longIndex < longLength){
            if(shorter.charAt(shortIndex) == longer.charAt(longIndex)){
                shortIndex++;
            }
            longIndex++;
            if(longIndex-shortIndex > 1){
                return false;
            }
        }
        return true;
    }
}
