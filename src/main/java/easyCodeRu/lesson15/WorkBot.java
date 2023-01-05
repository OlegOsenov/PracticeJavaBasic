package easyCodeRu.lesson15;

import java.util.Scanner;

public class WorkBot {
/* 15.4 Пишем чатбота для устройства на работу. Вопросы придумайте сами и условия тоже. Для
примера вам нужно спросить кандидата о знаниях тех или иных технологий и опыте работы.
Если все подходит – вывести – вы приняты на работу, иначе – отказано.
 */
    private static final String PLACE_OF_STUDE = "МГУ";
    private static final String TECHNOLOGIES = "Java";
    private static final int WORK_EXPERIENCE = 12;
    private static final String DINIED = "Вы не приняты на работу";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("Собесодование, в каком университе Вы учились? ");
        String place = scanner.nextLine();
        print("Какой язык программирования Вы знаете?");
        String techolog = scanner.nextLine();
        print("Какой рабочий опыт? (в месяцах)");
        int work = scanner.nextInt();
        if (!(PLACE_OF_STUDE.equals(place) && TECHNOLOGIES.equals(techolog) && WORK_EXPERIENCE <= work)){
            print(DINIED);
        }else {
            print("Вы приняты");
        }

    }
    private static void print(String str){
        System.out.println(str);
    }
}
