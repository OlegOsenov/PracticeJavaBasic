package easyCodeRuPractice.lesson21;

public abstract class Fiqure {
    protected final double[] sides;

    protected Fiqure(double[] sides) {
        this.sides = sides;
    }

    public double getPerimetr() {
        double perimetr = 0;
        for (double side : sides) {
            perimetr += side;
        }
        return perimetr;
    }

    public abstract double getArea();
}
