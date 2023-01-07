package easyCodeRuPractice.lesson18;

public class CommandAndResult {

    final String command;
    final String result;

    public CommandAndResult(String command, String result) {
        this.command = command;
        this.result = result;
        System.out.println("command" + this.command + ", result: " + this.result);
    }
}
