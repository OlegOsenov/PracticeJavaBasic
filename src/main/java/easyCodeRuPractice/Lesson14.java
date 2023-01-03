package easyCodeRuPractice;

public class Lesson14 {
    public static void main(String[] args) {
        print("Задание 1: ");
        showNumbersDividedBy3(10);
        print("Задание 2: ");
        showNumbersDividedByArg(10, 4);
        print("Задание 3: ");
        showFibbonachi(10);
        print("Задание 4: ");
        print(differenceBetweenMaxAndMin(new int[]{5, 3}));
        print(differenceBetweenMaxAndMin(new int[]{15, 2, 10, -3, 1, -13}));
        differenceBetweenMaxAndMinSorted(new int[]{15, 2, 10, -3, 1, -13});
    }

    private static void differenceBetweenMaxAndMinSorted(int[] array) {
        int min;
        int max;
        if (array.length < 2) {
            print("array doesn't contain at last 2 items");
        } else {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        isSorted = false;
                    }
                }
            }
            printArray(array);
            min = array[0];
            max = array[array.length - 1];
            print("\nmin = " + min + " max = " + max + "\ndifference = " + (max - min));
        }
    }

    private static int differenceBetweenMaxAndMin(int[] array) {
        int difference = 0;
        if (array.length < 2) {
            print("array doesn't contain at last 2 items");
        } else {
            final int item0 = array[0];
            final int lastItem = array[array.length - 1];
            boolean isFirstItem = item0 < lastItem;
            int min = isFirstItem ? item0 : lastItem;
            int max = isFirstItem ? lastItem : item0;
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] < min) {
                    min = array[i];
                } else if (array[i] > max) {
                    max = array[i];
                }
            }
            print("min " + min + " max " + max);
            difference = max - min;
        }


        return difference;
    }

    private static void showFibbonachi(int max) {
        int item0 = 1;
        int item1 = 1;
        for (int i = 0; i < max; i++) {
            if (i == 0 || i == 1) {
                print(1);
            } else {
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

    private static void printArray(int[] array) {
        System.out.print("[");
        ;
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.print("]");
    }
}
