package todolist2;

import java.util.ArrayList;



public class TaskManager{

    ArrayList<Tasks> arrayListName = new ArrayList<>();


    public void addTask(String name) {
        Tasks newTask = new Tasks();
        arrayListName.add(newTask.setName(name));
        System.out.print("Task Added: "+ getTaskName());
    }

    public String getTaskName() {
        if (!arrayListName.isEmpty()) {
            Tasks lastTask = arrayListName.get(arrayListName.size() - 1);
            return lastTask.getName();
        } else {
            return "No tasks added yet";
        }
    }

    public void deleteTask(int index){
        Tasks taskToRemove = arrayListName.get(index-1);
        arrayListName.remove(index-1);
        System.out.print("Task deleted: "+taskToRemove.getName()+" "+taskToRemove.isChecked());
        System.out.println(" ");
    }

    public void listTask(){
        for (int index=0; index < arrayListName.size(); index++){
            System.out.println((index+1)+" "+arrayListName.get(index).getName()+" "+arrayListName.get(index).isChecked());
        }
    }

    public void markCompleted(int taskIndex){
        if (taskIndex > 0 && taskIndex <= arrayListName.size()){
            arrayListName.get(taskIndex - 1).setChecked(true);
            System.out.println("task marked as check");
            System.out.println("-------------------------");
        } else {
            System.out.println("invalid index task");
            System.out.println("-------------------------");
        }
    }

}
