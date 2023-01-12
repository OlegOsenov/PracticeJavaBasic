package easyCodeRuPractice.lesson26;

public class Task {

    private final int id;
    private final Status status;
    private final String description;
    private final String designLink;

    public Task(int id, Status status, String description, String designLink, String testcase, String buildLink) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.designLink = designLink;
        this.testcase = testcase;
        this.buildLink = buildLink;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getDesignLink() {
        return designLink;
    }

    public String getTestcase() {
        return testcase;
    }

    public String getBuildLink() {
        return buildLink;
    }

    private final String testcase;
    private final String buildLink;


    enum Status {
        ASSEMBLING_REQUIREMENTS,
        READY_TO_DO,
        IN_PROGRESS,
        READY_FOR_TESTING,
        DONE
    }
}
