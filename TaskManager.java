import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;


public class TaskManager {
    public void saveTasks() {
    try {
        FileWriter writer = new FileWriter("C:\\Users\\%USERNAME%\\Desktop\\tasks.txt");

        for(Task t : queue) {
            writer.write(t.toString() + "\n");
        }

        writer.close();
        System.out.println("Tasks saved successfully!");
    } catch(IOException e) {
        e.printStackTrace();
    }
}



    private PriorityQueue<Task> queue;

    public TaskManager() {
        queue = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        queue.add(task);
    }

    public void removeTask(Task task) {
        queue.remove(task);
    }

    public PriorityQueue<Task> getTasks() {
        return queue;
    }
}
