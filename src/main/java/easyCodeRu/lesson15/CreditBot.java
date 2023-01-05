package easyCodeRu.lesson15;

import java.util.Scanner;

public class CreditBot {
    /* 15.3  Сделать бота для выдачи кредита. Условие кредита – зарплата от 25000 в месяц и срок
кредита до 1 года, максимальная сумма выдачи 150.000 рублей. Или можете придумать свои
условия. Главное собрать от юзера данные и обработать их. В итоге выдать – вам одобрен
кредит или же вам отказано. */
    private static final int CREDIT_MAX = 150_000;
    private static final int SALARY_MIN = 25_000;
    private static final int DURATION_MAX = 12;
    private static final String DINIED = "Извините, но вам отказано в кредите";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("Добрый день, желаете взять кредит? Какая у вас зарплата?");
        int salary = scanner.nextInt();
        print("На какой срок вы бы хотели получить кредит (в месяцах)?");
        int duration = scanner.nextInt();
        print("Какую сумму вы бы хотели взять в кредит?");
        int credit = scanner.nextInt();
        if (salary < SALARY_MIN || duration > DURATION_MAX || credit > CREDIT_MAX){
            print(DINIED);
        }else {
            print("Поздравляем, вам одобрен кредит на сумму " + CREDIT_MAX + " !");
        }
    }

    private static void print(String str){
        System.out.println(str);
    }
}
