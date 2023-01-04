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
        differenceBetweenMaxAndMinSorted(new int[]{15, 2, 10, -3, 1, -13, 3, -5, 11, 15, 19, 23, 45, 21, 7});
        print("Задание 6: ");
        showItemsRever(new int[]{15, 2, 10, -3, 1, -13});
        print("Задание 7: ");
        showIndex(new String[]{"a", "b", "this", "2", "this", "this"});
        print("Задание 8: ");
        arrayDiff(new int[]{15, -2, 10, -3, 1, -13});
        print("Задание 9: ");
        abs(new int[]{15, -2, 10, -3, 1, -13});
        abs(new int[]{15, -2, 10, -3, 1, -13, 1});
        print("Задание 10: ");
        absVer2(new int[]{1, 2, 3, 4, 3, 2, 1});
        print("Задание 11: ");
        printArray(doubleArray(new int[]{1, 2, 3, 4, 3, 2, 1}));
        print("Задание 13: ");
        printArray(productArrays(new int[]{1, 2, 3, 4, 3, 2, 1},new int[]{1, 2, 3, 4, 3, 2, 1}));

    }
    // 13 Метод принимает 2 массива чисел и выводит новый массив, где каждый член массива
    //это произведение членов соответственно. т.е. {1, 2, 3};{4, 5, 6} → {4, 10, 18}
    private static double[] productArrays(int[] array1,int[] array2){
        double[] result;
        final int arrayLength = array1.length;
        if (arrayLength == array2.length){
            result = new double[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                result[i] = ((double) array1[i]*array2[i]);
            }
        } else {
            print("array are different size");
            result = new double[]{};
        }
        return result;
    }


    //11 Метод принимает на вход массив чисел и отдает на выход массив вдвое больше.
    //Первый и второй элемент нового массива равны первому элементу первого массива.
    //Третий и четвертый элементы равны второму элементу первого массива. Типа {1, 2, 3}
    //→ {1, 1, 2, 2, 3, 3}
    private static int[] doubleArray(int[] array) {
        int[] result = new int[array.length * 2];
        int j = 0;
        for (int i = 0; i < result.length; i += 2) {
            result[i] = array[j];
            result[i+1] = array[j];
            j++;
        }
        return result;
    }


    //10 Метод принимает массив на вход и отдает новый массив где первым элементом
    //является сумма первого и последнего. Для второго элемента сумма второго и
    //предпоследнего.
    private static void absVer2(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i] + array[array.length - 1 - i];
        }
        printArray(result);
    }

    //9 Метод принимает массив на вход, и отдает новый массив, в котором каждый член это
//сумма этого числа и следующего. Последнее число останется таким какое есть.
    private static void abs(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length - 1; i++) {
            result[i] = array[i] + array[i + 1];
        }
        result[result.length - 1] = array[array.length - 1];
        printArray(result);
    }

    // Метод принимает массив чисел на вход и отдает на выход массив тех же чисел, но
//заменив отрицательные положительными. Нули не трогать.
    private static void arrayDiff(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i] > 0 ? array[i] : -1 * array[i];
        }
        printArray(result);
    }

    // Вывести индекс элемента массива который равен строке “this”, если их несколько, то this”, если их несколько, то
//через запятую
    private static void showIndex(String[] array) {
        if (array.length == 0) {
            print("array is empty");
        } else {
            String indexes = "";
            for (int i = 0; i < array.length; i++) {
                if ("this".equals(array[i])) {
                    if (!indexes.isEmpty()) {
                        indexes += ", ";
                    }
                    indexes += i;
                }
            }
            print(indexes);
        }
    }

    // Вывести в обратном порядке члены массива (метод принимает аргументом массив)
    private static void showItemsRever(int[] array) {
        if (array.length == 0) {
            print("array is empty");
        } else {
            for (int i = 0; i < array.length; i++) {
                print(array[array.length - 1 - i]);
            }
        }

    }

    //Найти минимум и максимум в массиве и вывести разницу с помощью сортировки
    private static void differenceBetweenMaxAndMinSorted(int[] array) {
        int min;
        int max;
        int countIter = 0;
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
                countIter++;
            }
            printArray(array);
            min = array[0];
            max = array[array.length - 1];
            print("\nmin = " + min + " max = " + max + "\ndifference = " + (max - min) +
                    " кол - во итерации = " + countIter);
        }
    }

    //Найти минимум и максимум в массиве и вывести разницу
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

    //Вывести первые n). Мы членов последовательности Фиббоначи
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

    /* Метод выводит все числа кратные числу, которое передаем в аргумент*/
    private static void showNumbersDividedByArg(int max, int arg) {
        for (int i = 0; i < max; i += arg) {
            print(i);
        }
    }

    /* Метод выводит все числа кратные 3 от нуля до какого-то числа (входной параметр) */
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
        System.out.print("]\n");
    }
    private static void printArray(double[] array) {
        System.out.print("[");
        ;
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.print("]\n");
    }
}
