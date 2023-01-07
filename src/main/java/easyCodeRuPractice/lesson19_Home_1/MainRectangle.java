package easyCodeRuPractice.lesson19_Home_1;

public class MainRectangle {
    public static void main(String[] args) {
        boolean valid = Rectangle.areValiq(0,0,0,0);
        if (valid){
            Rectangle rectangle = new Rectangle(2,2,2,2);
            System.out.println(rectangle.isSquare());
        }
    }
}
