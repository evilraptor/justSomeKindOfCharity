import jdk.jfr.Description;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String description;
    private int id;
    //TODO подумать что сделать с айдишниками типа они же должны быть уникальными
    private String status;
    private boolean isEpicFlag;
    private boolean isSubtaskFlag;
    private List<Task> subtasksList = new ArrayList<>();
    /**
     * можно реализовать через list_name.size но да ладно
     */
    private int countOfSubtasks = 0;
//TODO прочитай комм к countOfSubtasks.

    public Task() {
        name = "";
        description = "";
        id = -1;
        status = "";
        isEpicFlag = false;
        isSubtaskFlag = false;
    }

    public Task(String inputName, String inputDescription, int inputId) {
        name = inputName;
        description = inputDescription;
        id = inputId;
        status = "NEW";
        isEpicFlag = false;
        isSubtaskFlag = false;
    }

    public Task(String inputName, String inputDescription, int inputId, String inputStatus) {
        setName(inputName);
        setDescription(inputDescription);
        setId(inputId);
        setStatus(inputStatus);
        isEpicFlag = false;
        isSubtaskFlag = false;
    }

    //TODO подумать слишком большое количество аргументов-проблема? зато не приходится создавать 2 отдельных класс epic и subtask
    public Task(String inputName, String inputDescription, int inputId, String inputStatus, boolean inputIsEpic, boolean inputIsSubtask) {
        setName(inputName);
        setDescription(inputDescription);
        setId(inputId);
        setStatus(inputStatus);
        isEpicFlag = inputIsEpic;
        isSubtaskFlag = inputIsSubtask;
        if (inputIsEpic && inputIsSubtask) {
            System.out.println("Task can't be Epic and Subtask both... Task set as simple Task");
            isEpicFlag = false;
            isSubtaskFlag = false;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (!(status.equals("NEW") || status.equals("IN_PROGRESS") || status.equals("DONE"))) {
            System.out.println("Wrong input status");
            return;
        } else
            this.status = status;
    }


    public boolean isEpic() {
        return isEpicFlag;
    }

    public void setEpicFlag(boolean epicFlag) {
        isEpicFlag = epicFlag;
    }


    public boolean isSubtask() {
        return isSubtaskFlag;
    }

    public void setSubtaskFlag(boolean subtaskFlag) {
        isSubtaskFlag = subtaskFlag;
    }


    public List<Task> getSubtasksList() {
        if (isEpicFlag)
            return subtasksList;
        else
            return null;
    }

    public void addSubtask(Task task) {
        isEpicFlag=true;
        subtasksList.add(countOfSubtasks, task);
        countOfSubtasks++;
        task.setSubtaskFlag(true);
    }
}
