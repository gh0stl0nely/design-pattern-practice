package src.Memento.Example1;

public class Editor {

    private History history = new History();

    public void undo(){
        this.history.revert();
    }

    public void type(State newState){
        this.history.add(newState);
    }

    public void showAllStates(){
        System.out.println("Showing state...");
        history.showStates();
    }

    public State showLatestState(){
        return history.showLatestState();
    }
}
