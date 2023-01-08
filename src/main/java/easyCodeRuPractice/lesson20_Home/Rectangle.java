package easyCodeRuPractice.lesson20_Home;

import easyCodeRuPractice.lesson19_1.Triangle;
import easyCodeRuPractice.lesson20.Point;

public class Rectangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;
    public Rectangle(Point a, Point b, Point c, Point d){
        this(a.getDistanceTo(b), a.getDistanceTo(d), b.getDistanceTo(c), d.getDistanceTo(c));
    }

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }
    private boolean isSquare() {
        return this.sideA == this.sideB && this.sideA == this.sideC && this.sideA == sideD;
    }
}
