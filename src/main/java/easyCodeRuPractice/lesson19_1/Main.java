package easyCodeRuPractice.lesson19_1;

import static easyCodeRuPractice.lesson19_1.Triangle.areValidArgument;

public class Main {
    public static void main(String[] args) {
        boolean valid = areValidArgument(1, 2, 3);
        if (valid){
            Triangle triangle = new Triangle(1,2,3);
            System.out.println(triangle.isRightTriangle());
        }
    }
}
