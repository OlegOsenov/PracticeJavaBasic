package easyCodeRuPractice.lesson22;

import easyCodeRuPractice.lesson21.Circle;
import easyCodeRuPractice.lesson21.Fiqure;
import easyCodeRuPractice.lesson21.Rectangle;
import easyCodeRuPractice.lesson21.Triangle;

public class FigureFactory {

    public Fiqure create(double[] sides){
        if (sides.length == 1){
            return new Circle(sides[0]);
        } else if (sides.length == 2) {
            return new Rectangle(sides[0], sides[1]);
        } else if (sides.length == 3) {
            return new Triangle(sides[0],sides[1],sides[3]);
        } else {
            throw new IllegalArgumentException("can't create object with arguments " + sides);
        }
    }
}
