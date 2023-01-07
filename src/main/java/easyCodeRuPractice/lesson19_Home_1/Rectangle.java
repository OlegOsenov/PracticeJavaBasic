package easyCodeRuPractice.lesson19_Home_1;

public class Rectangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public boolean isSquare() {
        return this.sideA == this.sideB && this.sideA == this.sideC && this.sideA == sideD;
    }

    public static boolean areValiq(int sideA, int sideB, int sideC, int sideD) {
        return sideA > 0 && sideB > 0 && sideC > 0 && sideD > 0;
    }
}
