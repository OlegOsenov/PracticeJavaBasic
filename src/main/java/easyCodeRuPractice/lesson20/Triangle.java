package easyCodeRuPractice.lesson20;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(Point a, Point b, Point c) {
        this(a.getDistanceTo(b), a.getDistanceTo(c), b.getDistanceTo(c));

    }

    public Triangle(int sideA, int sideB, int sideC) {
        if (sideA > 0 && sideB > 0 && sideC > 0 &&
                sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else
            throw new IllegalArgumentException("invalid arguments " + sideA + ", " + sideB + ", " + sideC);
    }
    public static boolean areValidArgument(int sideA, int sideB, int sideC){
        return sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA;
    }
    public boolean isRightTriangle(){
        return this.sideA * this.sideA + this.sideB * this.sideB == this.sideC * this.sideC ||
                this.sideA * this.sideA + this.sideC * this.sideC == this.sideB * this.sideB ||
                this.sideC * this.sideC + this.sideB * this.sideB == this.sideA * this.sideA ;
    }
}
