package sort.Nowcoder;

import java.util.Arrays;

public class moreThanHalfNum {
    public static void main(String[] args) {

    }
    public int MoreThanHalfNum_Solution (int[] numbers) {
        // write code here
        Arrays.sort(numbers);
        return numbers[numbers.length>>1];

    }

}

