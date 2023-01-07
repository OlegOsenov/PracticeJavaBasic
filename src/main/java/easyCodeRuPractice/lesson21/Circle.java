package easyCodeRuPractice.lesson21;

public class Circle extends Fiqure {

    public Circle(double radius) {
        super("Circle",new double[]{radius});
    }

    public double getPerimetr() {
        return 2 * 3.14 * sides[0];
    }

    public double getArea() {
        return 3.14 * sides[0] * sides[0];
    }
}
