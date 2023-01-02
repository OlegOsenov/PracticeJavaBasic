package easyCodeRu.lesson15;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameDan = "Даниил";
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
    private static void print(String str){
        System.out.println(str);
    }
}
