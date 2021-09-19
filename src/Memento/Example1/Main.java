package src.Memento.Example1;

public class Main {
    public static void main(String[] args) {
        Editor e = initializeEditor();
        e.type(new State("Title 1", 1));
        e.type(new State("Title 2", 2));
        e.type(new State("Title 3", 3));
        e.undo();
        e.showAllStates();
        e.showLatestState();
    }

    public static Editor initializeEditor(){
        return new Editor();
    }
}
