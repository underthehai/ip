package main.java.emily.task;

public class ToDos extends Task{

    public ToDos(String description) {
        super(description);
        this.type = "T";
    }

    @Override
    public String toString(){
        return "[T]" + super.toString();
    }
}