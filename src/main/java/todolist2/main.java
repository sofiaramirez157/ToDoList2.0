package todolist2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Tasks> listTasks = new ArrayList<>();
         listTasks.add(new Tasks("meeting", " meeting with Julio for create the code",11,true));
         listTasks.add(new Tasks("buy","milk, egg, pasta, cheese", 13, false));
         listTasks.add(new Tasks("doctor", "prescribe ibuprofen for headache", 18, false));
         for(Tasks task : listTasks){
            System.out.println(task);
         }
    }
}