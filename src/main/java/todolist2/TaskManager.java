package todolist2;

import java.util.ArrayList;


public class TaskManager{
    
    ArrayList<String> arrayListName = new ArrayList<>();
    ArrayList<Boolean> arrayListChecked = new ArrayList<>();
    


    public void deleteTask(int index){
        arrayListChecked.remove(index-1);
        String deletedTask = arrayListName.remove(index-1);
        System.out.print("Task deleted: "+deletedTask);
        System.out.println(" ");
    }

    
}