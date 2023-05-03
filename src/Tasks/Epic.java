package Tasks;

import java.util.HashMap;
import java.util.List;

public class Epic extends Task{
    private HashMap<Integer, Task> subtasksList = new HashMap<Integer, Task>();

    public HashMap<Integer, Task> getSubtasksList() {
            return subtasksList;
    }

    public void addSubtask(Task task) {
        subtasksList.put(task.getId(), task);
        task.setSubtaskFlag(true);
    }
}
