package easyCodeRuPractice.lesson18;

public class Main {
    public static void main(String[] args) {
        CommandAndResult commandAndResult = new CommandAndResult();
        commandAndResult.command = "my command";
        commandAndResult.result = "my result";
        System.out.println(commandAndResult.command);
        System.out.println(commandAndResult.result);
        /*
        COMMAND_AND_RESULTS[0].command = "/help";
        COMMAND_AND_RESULTS[0].result = "";
        COMMAND_AND_RESULTS[1].command = "/start";
        COMMAND_AND_RESULTS[1].result = "Bot started";

         */
    }
    private static final CommandAndResult[] COMMAND_AND_RESULTS = new CommandAndResult[]{
            new CommandAndResult(),new CommandAndResult(),new CommandAndResult()
    };
}
