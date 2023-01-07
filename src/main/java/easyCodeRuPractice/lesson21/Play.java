package easyCodeRuPractice.lesson21;

public class Play {
    public static void main(String[] args) {
        Fiqure[] fiqures = new Fiqure[3];
        fiqures[0] = new Circle(2);
        fiqures[1] = new Rectangle(5, 6);
        fiqures[2] = new Triangle(3, 4, 5);

        for (Fiqure figure: fiqures) {
            print(figure.type + " - area: " + figure.getArea() + ", perimetr: " + figure.getPerimetr());
        }
    }

    private static void print(String str){
        System.out.println(str);
    }
}
