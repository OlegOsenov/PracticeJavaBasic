package easyCodeRuPractice.lesson26;

public abstract class Employee {

    private final TaskProgressCallbac callback;
    private final String name;
    private final Task.Status taskStatus;

    protected Employee(TaskProgressCallbac callback,String name, Task.Status taskStatus) {
        this.name = name;
        this.taskStatus = taskStatus;
        this.callback = callback;
    }

    public void doTask(Task task){
        System.out.println(getClass().getSimpleName() + " " + name + " is doing task " + getDetails(task));
        callback.updateTask(getTaskWhenDone(task));
    }
    public boolean canHandleTask(Task task){
        return taskStatus == task.getStatus();
    }

    public Task.Status getTaskStatus(){
        return taskStatus;
    }
    protected abstract Task getTaskWhenDone(Task task);
    protected abstract String getDetails(Task task);
}
