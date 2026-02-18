public class Task implements Comparable<Task> {

    private String title;
    private int priority;
    private String deadline;

    public Task(String title, int priority, String deadline) {
        this.title = title;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getTitle() { return title; }
    public int getPriority() { return priority; }
    public String getDeadline() { return deadline; }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return title + " | Priority: " + priority + " | Deadline: " + deadline;
    }
}
