package leetCode;

public class Num2485 {
    public static void main(String[] args) {
        Num2485 num2485 = new Num2485();
        num2485.pivotInteger(1);

    }
    public int pivotInteger(int n) {
        int[] prefixSum = new int[n+1];
        int[] postfixSum = new int[n+1];
        for (int i = 0,k = 1; i < n; i++,k++) {
            prefixSum[i+1] = prefixSum[i]+k;
        }
        for (int i = n,k = n; i > 0 ; i--,k--) {
            postfixSum[i-1] = postfixSum[i]+k;
        }
        for (int i = 0; i < n; i++) {
            if(postfixSum[i] == prefixSum[i+1]){
                return i+1;
            }
        }
        return -1;
    }
}
