package tasks;

import java.util.ArrayList;

public class TaskList {
    private static  TaskList instance = null;

    private TaskList() {

    }
    public static TaskList getInstance() {
        if(instance == null) {
            instance = new TaskList();
        }
        return instance;
    }

    private ArrayList<Task> taskList = new ArrayList<Task>();

    public ArrayList<Task> getTaskList() {
        return taskList;
    }


    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

}
