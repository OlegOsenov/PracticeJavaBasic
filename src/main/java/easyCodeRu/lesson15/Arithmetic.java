package easyCodeRu.lesson15;

import java.util.Scanner;

/* 15.5 В консоль вводят 10 чисел последовательно. Проверить что они являются арифметической
последовательностью. Выдать что это не последовательность сразу же, как только вводится
неверное число.   */
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 2;
        int difference;
        int[] array = new int[10];
        array[0] = scanner.nextInt();
        array[2] = scanner.nextInt();
        final int diff = array[1] - array[0];
        while (count < 10) {
            array[count] = scanner.nextInt();
            difference = array[count] - array[count - 1];
            if (diff != difference) {
                break;
            }
            count++;
        }


    }
}
