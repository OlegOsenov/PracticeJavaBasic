package easyCodeRuPractice.lesson26;

public class EmployeeChain implements TaskHadler {

    private final TaskHadler first;
    private final TaskHadler second;
    private EmployeeChain nextEmployeeChain;

    public EmployeeChain(TaskHadler first, TaskHadler second) {
        this.first = first;
        this.second = second;
    }


    public boolean doTask(Task task) {
        boolean result;
        result = first.doTask(task);
        if (!result) {
            result = second.doTask(task);
        }
        return result;
    }

    public void setNextEmployeeChain(EmployeeChain nextEmployeeChain) {
        this.nextEmployeeChain = nextEmployeeChain;
    }
}
