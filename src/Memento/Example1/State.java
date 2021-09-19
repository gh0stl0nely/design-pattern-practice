package src.Memento.Example1;

public class State {
    private String title;
    private int id;

    public State(String title, int id){
        this.title = title;
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public int getId(){
        return this.id;
    }
}
