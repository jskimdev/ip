public class Event extends Task{
    private String from;
    private String to;

    public Event(String task, String from, String to) {
        super(TaskType.EVENT, task);
        this.from = from;
        this.to = to;
    }

    public Event(String task, String from, String to, boolean isDone) {
        super(TaskType.EVENT, task, isDone);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "[" + getTaskType().getIcon() + "]" + "[" + getStatusIcon() + "] " + getTask() + " (from: " + getFrom() + " to:" + getTo() + ")";
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }
}
