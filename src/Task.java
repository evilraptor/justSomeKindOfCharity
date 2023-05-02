import java.util.ArrayList;
import java.util.Collection;

public class Task {
    private String name;
    private String description;
    private int id;
    private String status;
    private Collection<String> subTasks = new ArrayList<>();

    public Task() {
        name = "";
        description = "";
        id = -1;
        status = "";
    }

    public Task(String inputName, String inputDescription, int inputId, String inputStatus) {
        name = inputName;
        description = inputDescription;
        id = inputId;
        status = inputStatus;
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
