package easyCodeRuPractice.lesson21;

import java.util.Arrays;

public abstract class Fiqure {
    final String type;
    protected final double[] sides;

    protected Fiqure(double[] sides) {
        this.type = getClass().getSimpleName();
        this.sides = sides;
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getType() + " - area: " + getArea() + ", perimeter: " + getPerimetr();
    }

    protected double getPerimetr() {
        double perimetr = 0;
        for (double side : sides) {
            perimetr += side;
        }
        return perimetr;
    }

    protected abstract double getArea();
}
