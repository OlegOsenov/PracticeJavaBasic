package easyCodeRuPractice.lesson26;

public class StartTask {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallbac callback = factory::updateTask;
        EmployeeChain chain = new EmployeeChain(new Designer(callback,"Alycia"));
        EmployeeChain next = new EmployeeChain(new Programmer(callback,"John"));
        EmployeeChain last = new EmployeeChain(new Tester(callback,"Steve"));
        next.setNextEmployeeChain(last);
        chain.setNextEmployeeChain(next);

        while (true)
            chain.doTask(factory.getTask());
    }
}
