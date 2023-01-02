package easyCodeRu.lesson15;

import java.util.Scanner;

public class Lesson {
    static Scanner scanner = new Scanner(System.in);
    static String nameDan = "Даниил";
    public static void main(String[] args) {

        while (true){
            print("Введите имя: ");
            String nameScan = scanner.nextLine();

            if (nameScan.equals(nameDan)){
                break;
            }
            print("Вы ввели имя : " + nameScan);
        }
        print("Программа завершена");
    }
    public static void print(String str){
        System.out.println(str);
    }
}
