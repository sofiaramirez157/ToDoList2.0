package todolist2;

import java.util.ArrayList;



public class TaskManager{
    
    public static ArrayList<Tasks> arrayListName = new  ArrayList<>();

    public void addTask(String name) {

        Tasks newTask = new Tasks();
        arrayListName.add(newTask.setName(name));
        System.out.print("Task Added: "+ getTaskName());

    }

    public void deleteTask(int index){
    
        if (index >= 0 && index < arrayListName.size()) {
            arrayListName.remove(index);
            System.out.println("Task deleted successfully.");
            System.out.print("Task deleted: "+ getTaskName()  );

            System.out.println(" ");
        } else {
            System.out.println("Invalid task number.");
        }
        
    }

    public void listTasks() {
        System.out.println("Tasks:");
    
        
        if (arrayListName.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
    
            int index = 0;
            for (Tasks task : arrayListName) {
                System.out.println((index + 1) + ". " + task.getName()  + (task.isChecked(index) ? "[X]" : "[]"));
                index++;
            }
        }
    }

    public void markComplited(int index){

        if (arrayListName.isEmpty()) {
            System.out.println("No tasks available.");
        }else{
            Tasks task = arrayListName.get(index-1);
            task.setChecked(true);

        }

    }

     public String getTaskName() {
        
        if (!arrayListName.isEmpty()) {
            Tasks listTask = arrayListName.get(arrayListName.size() - 1);
            return listTask.getName() ;
        } else {
            return "No tasks added yet";
        }
    }
    public boolean isEmpty() {
        return arrayListName.isEmpty();
    }
        
}