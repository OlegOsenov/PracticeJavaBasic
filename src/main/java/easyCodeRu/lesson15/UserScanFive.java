package easyCodeRu.lesson15;

import java.util.Scanner;

public class UserScanFive {
    /* 15.2   Для каждого введенного в консоль числа проверять кратно ли оно 5 или нет. Если
кратно,то выводить в консоль – кратное 5. Ограничить ввод 20 числами. (условие) и
фигурные скобки. Пока условие равно оператор %) */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 1;
        while (count <= 20) {
            System.out.println("Введите ваше число: ");
            count++;
            int number = scanner.nextInt();
            if (number % 5 == 0) {
                System.out.println("Кратное 5");
            } else{
                System.out.println("Не кратно 5");
            }
        }
    }
}
