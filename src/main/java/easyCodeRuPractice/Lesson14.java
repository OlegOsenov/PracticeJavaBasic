package easyCodeRuPractice;

public class Lesson14 {
    public static void main(String[] args) {
        print("Задание 1: ");
        showNumbersDividedBy3(10);
        print("Задание 2: ");
        showNumbersDividedByArg(10, 4);
    }

    private static void showNumbersDividedByArg(int max, int arg) {
        for (int i = 0; i < max; i += arg) {
            print(i);
        }
    }

    private static void showNumbersDividedBy3(int max) {
        for (int i = 0; i < max; i += 3) {
            print(i);
        }
    }

    private static void print(String str) {
        System.out.println(str);
    }

    private static void print(int str) {
        System.out.println(str);
    }
}
