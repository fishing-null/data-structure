package offer;

public class Offer11 {
    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i+1]<numbers[i]){
                return numbers[i+1];
            }
        }
        return numbers[0];
    }
}
