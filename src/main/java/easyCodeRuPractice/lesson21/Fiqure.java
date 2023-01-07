package easyCodeRuPractice.lesson21;

public abstract class Fiqure {
    final String type;
    protected final double[] sides;

    protected Fiqure(String type, double[] sides) {
        this.type = type;
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
