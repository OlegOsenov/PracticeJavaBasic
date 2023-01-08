package easyCodeRuPractice.lesson20;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Point(0, 3),
                new Point(4, 0),
                new Point(0, 0)
        );
        System.out.println(triangle.isRightTriangle());
        System.out.println(triangle.getDescription());
    }
}
