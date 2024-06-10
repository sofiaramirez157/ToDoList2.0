package todolist2;

public class Tasks {

    private String name;
    private boolean checked; 

    
    public String getName() {
        return name;
    }

    
    public Tasks setName(String name) {
        this.name = name;
        return this;
    }

    
    public boolean isChecked() { 
        return checked;
    }

   
    public void setChecked(boolean checked) { 
        this.checked = checked;
    }

}
