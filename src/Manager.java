import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Manager {
    //private Task tasksList[];//=new Task[1];
    private List<Task> taskList = new ArrayList<>();
    private int countOfTasks = 0;

    public List<Task> getTaskList() {
        return taskList;
    }

    public void cleanTaskList() {
        taskList.clear();
    }

    public Task getTaskById(int inputId) {
        for (int i = 0; i <= countOfTasks; i++) {
            if (taskList.get(i).getId() == inputId) return taskList.get(i);
        }
        return null;
    }

    /*public void addTask(String inputName, String inputDescription, int inputId, String inputStatus) {
        taskList.add(countOfTasks, new Task(inputName, inputDescription, inputId, inputStatus));
        countOfTasks++;
    }*/

    public void addTask(Task task) {
        taskList.add(countOfTasks, task);
        countOfTasks++;
    }

    //TODO написать обновление таска (не понятно что же это значит)
    public void updateTask(int previousTaskId, Task newTask) {
        if (getTaskById(previousTaskId) != null) {
            return;
        } else {
            deleteTaskById(previousTaskId);
            addTask(newTask);
        }
    }
    //FIXME возможно лишь возможно оно выглядит так??? здесь не понятно что делать если не было такого таска но я просто ретерню

    public void deleteTaskById(int inputId) {
        for (int i = 0; i <= countOfTasks; i++) {
            if (taskList.get(i).getId() == inputId) {
                taskList.remove(i);
                countOfTasks--;
                break;
            }
        }
    }
}
