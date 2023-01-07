package easyCodeRu.lesson15;

import java.util.Scanner;

/* 15.6 Пишем полноценного бота который имеет какое-то количество команд и может выдать
какую-то информацию по ним. На любой ввод который не подпадает под команды выдаем
список возможных команд с предложением – извините, но такой команды нет. Вот список
того, что вы можете узнать. Добавить команду выхода и при ее вводе выйти из программы   */
public class CommandBot {
    private static final String[] COMMANDS = new String[]{
            "/help", "/start", "/end", "/getLocation"
    };
    private static final String[] RESULTS = new String[]{
            "", "Bot started!...", "Bot ended", "location is Moscow"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = "commands available for this bot \n";
        for (String command : COMMANDS) {
            commands += command + "\n";
        }
        RESULTS[0] = commands;
        System.out.print("Введите команду:");
        String input;
        boolean found;
        while (true){
            input = scanner.nextLine();
            found = false;
            for (int i = 0; i < COMMANDS.length; i++) {
                if (COMMANDS[i].equals(input)){
                    System.out.println(RESULTS[i]);
                    found = true;
                    break;
                }
            }
            if (COMMANDS[2].equals(input)){
                break;
            }
            if (!found){
                System.out.println("no command found for that input. Try typing " + COMMANDS[0]);
            }
        }

    }
}
