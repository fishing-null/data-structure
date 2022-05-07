package offer;

public class OfferII098 {
    //超时
    public int uniquePaths(int m, int n) {
        if(m==1 && n>=1){
            return m;
        }else if(n==1 && m>=1){
            return n;
        }
        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    }
}
