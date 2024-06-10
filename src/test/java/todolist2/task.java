package todolist2;

public class task{

    private String name;
    private boolean Check;

    public task(String name, boolean Check) {
        this.name = name;
        this.Check = Check;

    }

    public String getName() {
        return name;
    }

    

    public boolean Check() {
        return Check;
    }

    public void setCheck(boolean Check) {
        this.Check = Check;
    }
    
    

}
    
    
