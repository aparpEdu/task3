package tasks;

import java.io.PrintWriter;
import java.util.ArrayList;

public class TaskHelper {
private static boolean available = false;
    public static void addToList(String desc,String endDate,int id,String title){
        Task task = new Task();
        task.setDescription(desc);
        task.setEndDate(endDate);
        task.setId(id);
        task.setTitle(title);
        ArrayList<Task> taskList = TaskList.getInstance().getTaskList();
        taskList.add(task);
       TaskList.getInstance().setTaskList(taskList);
    }
    public static void showTask(int id, PrintWriter out){

        for(Task task: TaskList.getInstance().getTaskList()){
            if(task.getId() == id) {
                out.println(task);
                setAvailable(true);
            }
        }
        if(!isAvailable()){
            out.println("No such task exist");
        }
        setAvailable(false);
    }
    public static void showAllTasks(PrintWriter out){
        ArrayList<Task> tasks =  TaskList.getInstance().getTaskList();
        for(Task task: tasks){
            out.println(task.toString());
        }
    }

    private static boolean isAvailable() {
        return available;
    }

    private static void setAvailable(boolean available) {
       TaskHelper.available = available;
    }
}
