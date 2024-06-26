package todolist2;

import java.util.Scanner;

public final class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        System.out.println("WELCOME TO TASK MANAGER");


    while (true) {
        System.out.println(" ");
        System.out.println("1 Add Task");
        System.out.println("2 Delete Task");
        System.out.println("3 Check Task");
        System.out.println("4 List Task");
        System.out.println("5 Exit");
        System.out.println(" ");
        System.out.print("What do you want to do? (Enter the number): ");

        int choice = input.nextInt();

        if (choice==1) {
            input.nextLine();
            System.out.println(" ");
            System.out.print("What task do you want to Add? ");
            taskManager.addTask(input.nextLine());
        }else if (choice==2) {
            taskManager.listTask();
            System.out.println(" ");
            System.out.print("What task do you want to delete? ");
            taskManager.deleteTask(input.nextInt());
        }else if (choice==3) {
            taskManager.listTask();
            System.out.println("Enter the checked task number:");
            int taskIndex = input.nextInt();
            taskManager.markCompleted(taskIndex);
        }else if (choice==4){
            taskManager.listTask();
        }else if (choice==5){
            break;
        }
    }
        input.close();
    }

}
