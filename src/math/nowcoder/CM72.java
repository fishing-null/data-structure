package math.nowcoder;

public class CM72 {
    public int addAB(int A, int B) {
        if(B == 0){
            return A;
        }
        int sum = 0;
        int carry = 0;
        while(B != 0){
            sum = A^B;
            carry = (A&B)<<1;
            A = sum;
            B = carry;
        }
        return A;
    }
}
