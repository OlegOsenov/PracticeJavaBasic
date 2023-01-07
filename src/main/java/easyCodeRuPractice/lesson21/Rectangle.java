package easyCodeRuPractice.lesson21;

public class Rectangle extends Fiqure {

    public Rectangle(double a, double b) {
        super("Rectangle", new double[]{a, b});
    }

    public double getPerimetr() {
        return sides[0] * sides[1];
    }

    public double getArea() {
        return 2 * super.getPerimetr();
    }
}
