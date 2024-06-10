package todolist2;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

   
  
    public static void main(String[] args) {

    ArrayList<task> taskList = new ArrayList<>(); 
    Scanner scanner = new Scanner(System.in);
    
    taskList.add(new task("Buy fruits", false));
    taskList.add(new task("Buy meat", false));
    taskList.add(new task("Going to the Gym", false));
    taskList.add(new task("Buy vegetables", false));
    
    
    System.out.println("Welcome to do my list");
    System.out.println("--------------------------");
    for (int i = 0; i < taskList.size(); i++){
    System.out.println(i + ". " + taskList.get(i).getName());
      
    }
    System.out.println("Enter the checked task numer:");
        int taskIndex = scanner.nextInt();
        
      
        if (taskIndex >= 0 && taskIndex < taskList.size()){
          taskList.get(taskIndex).setCheck(true);
    System.out.println("task marked as check");
    System.out.println("-------------------------");
        } else {
    System.out.println("invalid index task");
    System.out.println("-------------------------");
            }
          scanner.close();
            
          }

    
          
        }

    


 

  


  

    
    
  

