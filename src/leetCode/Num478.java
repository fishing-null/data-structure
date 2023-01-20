package leetCode;

import java.util.Random;

public class Num478 {
    public static void main(String[] args) {

    }
    Random random;
    double radius;double x_center;double y_center;
    public Num478(double radius, double x_center, double y_center) {
        random = new Random();
        this.y_center = y_center;
        this.x_center = x_center;
        this.radius = radius;
    }

    public double[] randPoint() {
        while (true){
            double x = random.nextDouble()*2*radius - radius;
            double y = random.nextDouble()*2*radius - radius;
            if(x*x + y*y <= radius*radius){
                return new double[] {x+x_center,y+y_center};
            }
        }
    }
}
