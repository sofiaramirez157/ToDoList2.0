package todolist2;

import java.util.ArrayList;



public class TaskManager{

    ArrayList<Tasks> arrayListName = new ArrayList<>();


    public void addTask(String name){

        arrayListName.add(new Tasks().setName(name));

        Boolean check = new Boolean();

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
        arrayListName.remove(index-1);
        System.out.print("Task deleted: "+getTaskName());
        System.out.println(" ");
    }


}
