package easyCodeRuPractice.lesson22;

import easyCodeRuPractice.lesson21.Fiqure;

public class Main {
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();
        print(factory.create(2),
                factory.create(5, 6),
                factory.create(3, 4, 5));


    }

    private static void print(String txt) {
        System.out.println(txt);
    }

    private static void print(Fiqure... fiqures) {
        for (int i = 0; i < fiqures.length; i++) {
            print(fiqures[i].toString());
        }
        }
    }

