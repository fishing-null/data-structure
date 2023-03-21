package math.leetcode;

public class Num2496 {
    public static void main(String[] args) {

    }
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius*1.8 + 32.00;
        return new double[] {kelvin,fahrenheit};
    }
}
