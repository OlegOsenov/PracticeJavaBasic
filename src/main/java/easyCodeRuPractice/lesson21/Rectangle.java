package easyCodeRuPractice.lesson21;

public class Rectangle extends Fiqure {

    public Rectangle(double a, double b) {
        super(new double[]{a, b});
    }

    @Override
    protected String getType() {
        return "Прямоугольник";
    }

    public double getPerimetr() {
        return sides[0] * sides[1];
    }

    protected double getArea() {
        return 2 * super.getPerimetr();
    }

    @Override
    public String toString() {
        return getType() + " " + "площадь: " + getArea();
    }
}
