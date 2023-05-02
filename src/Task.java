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
        name = inputName;
        description = inputDescription;
        id = inputId;
        status = inputStatus;
        isEpic=false;
        isSubtask=false;
    }
    //TODO подумать слишком большое количество аргументов-проблема? зато не приходится создавать 2 отдельных класс epic и subtask
    public Task(String inputName, String inputDescription, int inputId, String inputStatus,boolean inputIsEpic,boolean inputIsSubtask) {
        name = inputName;
        description = inputDescription;
        id = inputId;
        status = inputStatus;
        isEpic=inputIsEpic;
        isSubtask=inputIsSubtask;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Collection<String> getSubTasks() {
        return subTasks;
    }
}
