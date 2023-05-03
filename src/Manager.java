import Tasks.Task;

import java.util.HashMap;

public class Manager {
    private HashMap<Integer, Task> taskList = new HashMap<Integer, Task>();

    public HashMap<Integer, Task> getTaskList() {
        return taskList;
    }

    public void cleanTaskList() {
        taskList.clear();
    }

    public Task getTaskById(int inputId) {
        if (taskList.containsKey(inputId)) return taskList.get(inputId);
        else return null;
    }

    /*public void addTask(String inputName, String inputDescription, int inputId, String inputStatus) {
        taskList.add(countOfTasks, new Tasks.Task(inputName, inputDescription, inputId, inputStatus));
        countOfTasks++;
    }*/

    public void addTask(Task task) {
        taskList.put(task.getId(), task);
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
        if (taskList.containsKey(inputId)) taskList.remove(inputId);
    }
}
