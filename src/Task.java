import java.util.ArrayList;
import java.util.Collection;

public class Task {
    private String name;
    private String description;
    private int id;
    private String status;
    private boolean isEpic;
    private boolean isSubtask;
    private Collection<String> subTasks = new ArrayList<>();

    public Task() {
        name = "";
        description = "";
        id = -1;
        status = "";
        isEpic = false;
        isSubtask = false;
    }

    public Task(String inputName, String inputDescription, int inputId) {
        name = inputName;
        description = inputDescription;
        id = inputId;
        status = "NEW";
        isEpic = false;
        isSubtask = false;
    }

    public Task(String inputName, String inputDescription, int inputId, String inputStatus) {
        setName(inputName);
        setDescription(inputDescription);
        setId(inputId);
        setStatus(inputStatus);
        isEpic = false;
        isSubtask = false;
    }

    //TODO подумать слишком большое количество аргументов-проблема? зато не приходится создавать 2 отдельных класс epic и subtask
    public Task(String inputName, String inputDescription, int inputId, String inputStatus, boolean inputIsEpic, boolean inputIsSubtask) {
        setName(inputName);
        setDescription(inputDescription);
        setId(inputId);
        setStatus(inputStatus);
        isEpic = inputIsEpic;
        isSubtask = inputIsSubtask;
        if (inputIsEpic && inputIsSubtask) {
            System.out.println("Task can't be Epic and Subtask both... Task set as simple Task");
            isEpic = false;
            isSubtask = false;
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
        return isEpic;
    }

    public boolean isSubtask() {
        return isSubtask;
    }

    public Collection<String> getSubTasks() {
        return subTasks;
    }


}
