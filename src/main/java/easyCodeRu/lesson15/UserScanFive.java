package easyCodeRu.lesson15;

import java.util.Scanner;

public class UserScanFive {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 1;
        while (count <= 20) {
            count++;
            int number = scanner.nextInt();
            if (number % 5 == 0) {
                System.out.println("Кратное 5");
            }
        }
    }
}
