package easyCodeRuPractice.lesson22;

import easyCodeRuPractice.lesson21.Fiqure;

public class Main {
    public static void main(String[] args) {
        Fiqure[] fiqures = new Fiqure[3];
        FigureFactory factory = new FigureFactory();
        fiqures[0] = factory.create(new double[]{2});
        fiqures[1] = factory.create(new double[]{5, 6});
        fiqures[2] = factory.create(new double[]{3, 4, 5});

        for (Fiqure figure : fiqures
        ) {
            System.out.println(figure.toString());
        }
    }
}
