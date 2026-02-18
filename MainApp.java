import java.awt.*;
import javax.swing.*;

public class MainApp {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        JFrame frame = new JFrame("Smart Task Scheduler");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField titleField = new JTextField(15);
        JTextField priorityField = new JTextField(5);
        JTextField deadlineField = new JTextField(10);

        JButton addButton = new JButton("Add Task");

        JTextArea displayArea = new JTextArea(15, 50);
        displayArea.setEditable(false);

        frame.add(new JLabel("Title:"));
        frame.add(titleField);

        frame.add(new JLabel("Priority (1-High, 2-Med, 3-Low):"));
        frame.add(priorityField);

        frame.add(new JLabel("Deadline:"));
        frame.add(deadlineField);

        frame.add(addButton);
        frame.add(new JScrollPane(displayArea));

        addButton.addActionListener(e -> {

            String title = titleField.getText();
            int priority = Integer.parseInt(priorityField.getText());
            String deadline = deadlineField.getText();

            Task task = new Task(title, priority, deadline);
            manager.addTask(task);

            displayArea.setText("");

            for(Task t : manager.getTasks()) {
                displayArea.append(t.toString() + "\n");
            }
        });

        frame.setVisible(true);
    }
}
