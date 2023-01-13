package easyCodeRuPractice.lesson26;

public abstract class Employee implements TaskHadler {

    private final TaskProgressCallback callback;
    private final String name;
    private final Task.Status taskStatus;

    protected Employee(TaskProgressCallback callback, String name, Task.Status taskStatus) {
        this.name = name;
        this.taskStatus = taskStatus;
        this.callback = callback;
    }

    public boolean doTask(Task task) {
        boolean canHadle = taskStatus == task.getStatus();
        if (canHadle){
            System.out.println(getClass().getSimpleName() + " " + name + " is doing task " +
                    getDetails(task));
            callback.updateTask(getTaskWhenDone(task));
        }
        return canHadle;
    }

    public boolean canHandleTask(Task task) {
        return taskStatus == task.getStatus();
    }

    public Task.Status getTaskStatus() {
        return taskStatus;
    }

    protected abstract Task getTaskWhenDone(Task task);

    protected abstract String getDetails(Task task);
}
