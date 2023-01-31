package leetCode;

public class Num1588 {
    public static void main(String[] args) {
        Num1588 num1588 = new Num1588();
        num1588.sumOddLengthSubarrays(new int[] {1,4,2,5,3});

    }
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefixSums = new int[n+1];
        for (int i = 0; i < n; i++) {
            prefixSums[i+1] = prefixSums[i] + arr[i];
        }
        int sum = 0;
        for (int start = 0; start < n; start++) {
            for (int length = 1; start + length <= n ; length += 2) {
                int end = start + length -1;
                sum += prefixSums[end + 1]-prefixSums[start];
            }
        }
        return sum;
    }
}
