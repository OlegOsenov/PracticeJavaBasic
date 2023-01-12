package easyCodeRuPractice.lesson26;

public class Programmer extends Employee{
    protected Programmer(TaskProgressCallbac callback, String name) {
        super(callback, name, Task.Status.READY_TO_DO);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.READY_FOR_TESTING,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestcase(),
                getBuildLinkForTask(task.getId())
        );
    }

    private String getBuildLinkForTask(int taskId) {
        return "https://bitbucket/project/link_for_build_with_task_id_" + taskId;
    }

    @Override
    protected String getDetails(Task task) {
        return " with task id" + task.getId() + " and designLink" + task.getDesignLink() +
                "\nand testcase " + task.getTestcase();
    }
}
