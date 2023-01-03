package easyCodeRuPractice;

public class Lesson14 {
    public static void main(String[] args) {
        print("Задание 1: ");
        showNumbersDividedBy3(10);
        print("Задание 2: ");
        showNumbersDividedByArg(10, 4);
        print("Задание 3: ");
        showFibbonachi(10);
    }

    private static void showFibbonachi(int max) {
        int item0 = 1;
        int item1 = 1;
        for (int i = 0; i < max; i++) {
            if (i == 0 || i == 1){
                print(1);
            }else {
                print(item0 + item1);
                int item1Old = item1;
                item1 = item0 + item1;
                item0 = item1Old;
            }
        }
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
