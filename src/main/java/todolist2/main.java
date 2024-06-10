package todolist2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList <Tasks> ListTasks = new ArrayList<>();
         ListTasks.add(new Tasks("meeting", " meeting with Julio for create the code",11,true));
         ListTasks.add(new Tasks("buy","milk, egg, pasta, cheese", 13, false));
         ListTasks.add(new Tasks("doctor", "prescribe ibuprofen for headache", 18, false));
         for(Tasks task : ListTasks){
            System.out.println(task);
         }
    }
}