package easyCodeRu.lesson15;

import java.util.Scanner;
/* 15.1 Написать программу, которая будет приветствовать всех, кроме Даниила. т.е. вы вводите
имя, программа выдает “Привет, “ + введенное имя. До тех пор пока вы не ввели имя Даниил.
  */
public class Lesson {
    static Scanner scanner = new Scanner(System.in);
    static String nameDan = "Даниил";
    public static void main(String[] args) {

        while (true){
            print("Введите имя: ");
            String nameScan = scanner.nextLine();

            if (nameDan.equals(nameScan)){
                break;
            }
            print("Вы ввели имя : " + nameScan);
        }
        print("Программа завершена");
        scanner.close();
    }
    public static void print(String str){
        System.out.println(str);
    }
}
