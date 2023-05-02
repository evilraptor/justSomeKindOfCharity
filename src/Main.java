import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");
        Task justTask = new Task(); //там в классе есть куча конструкторов но для наглядности через гетеры сетеры
        justTask.setName("justTask");
        justTask.setDescription("an example of description?");
        justTask.setId(1);//прочти 1ый тудушник в классе таск

        Task justSubtask = new Task(); //там в классе есть куча конструкторов но для наглядности через гетеры сетеры
        justSubtask.setName("justSubtask");
        justSubtask.setDescription("an example of justSubtask description?");
        justSubtask.setId(23);//прочти 1ый тудушник в классе таск

        justTask.addSubtask(justSubtask);

        Manager manager = new Manager();
        manager.addTask(justTask);


        List<Task> listFromManager = manager.getTaskList();
        for (int i = 0; i < listFromManager.size(); i++) {
            Task tmp=listFromManager.get(i);
            System.out.println(tmp.getName()+"\n"+tmp.getDescription());
            if(tmp.isEpic()) {
                List<Task> subtasksListOfTmp = tmp.getSubtasksList();
                int SubtasksCountOfTmp=subtasksListOfTmp.size();//хочу показать разные варианты мб вам как-то удобнее будет с выводом писать
                for (int j = 0; j < SubtasksCountOfTmp; j++){
                    Task subtaskTmp=subtasksListOfTmp.get(i);
                    System.out.println(subtaskTmp.getName()+"\n"+subtaskTmp.getDescription());
                }
                System.out.println();
            }
        }
    }
}