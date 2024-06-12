package todolist2;

import java.util.ArrayList;

public class Tasks {
    private String name;
    private String description;
    private int time;
    private Boolean completed;
}
// Create the builder

public Tasks(String name, String description, int time, Boolean completed) { 
    this.name = name;
    this.description = description;
    this.time = time;
    this.completed = false;
}

// Getters and Setters

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

public String getDescription(){
    return description;
}
public void setDescription(String description) {
    this.description = description;
}

public int getTime(){
    return time;
}
public void setTime(int time) {
    this.time = time; 
}

public boolean getCompleted(){
    return completed;
}
public void setCompleted(boolean completed) {
    this.completed = completed;
}
 
public String tasks(String name, String description, int time, boolean completed){
     return "name" + ' ' + "description" + ' ' + "time" + ' ' + "completed";
}