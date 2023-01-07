package easyCodeRuPractice.lesson18;

import java.util.Scanner;

public class Main {
    private static final CommandAndResult[] COMMAND_AND_RESULTS = new CommandAndResult[]{
            new CommandAndResult("/help",""),
            new CommandAndResult("/start","Bot started"),
            new CommandAndResult("/getLocation","location is Moscow"),
            new CommandAndResult("/end","Bot ended")
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = "commands available for this bot \n";
        for (CommandAndResult item:COMMAND_AND_RESULTS) {
            commands += item.command + "\n";
        }
        COMMAND_AND_RESULTS[0] = new CommandAndResult(COMMAND_AND_RESULTS[0].command,commands);

        String input;
        boolean found;
        while (true){
            input = scanner.nextLine();
            found = false;
            for (int i = 0; i < COMMAND_AND_RESULTS.length; i++) {
                if (COMMAND_AND_RESULTS[i].command.equals(input)){
                    System.out.println(COMMAND_AND_RESULTS[i].result);
                    found = true;
                    break;
                }
            }
            if (COMMAND_AND_RESULTS[COMMAND_AND_RESULTS.length - 1].command.equals(input)) {
                break;
            }
            if (!found){
                System.out.println("no command found for that input.Try typing " + COMMAND_AND_RESULTS[0].command);
            }
        }
    }

}
