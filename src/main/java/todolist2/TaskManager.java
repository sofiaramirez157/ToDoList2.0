package todolist2;

import java.util.ArrayList;



public class TaskManager{

    ArrayList<Tasks> arrayListName = new ArrayList<>();


    public void addTask(String name){

        arrayListName.add(new Tasks().setName(name));

        System.out.print("Task Add: "+ getTaskName());
        System.out.println(" ");
    }
    public String getTaskName() {
        // Obtén el nombre de la última tarea agregada
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
}
