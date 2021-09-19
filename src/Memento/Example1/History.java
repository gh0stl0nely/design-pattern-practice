package src.Memento.Example1;
import java.util.Stack;

public class History {
    private Stack<State> states = new Stack();

    public void add(State state){
        states.add(state);
    }
    
    public void revert(){
        states.pop();
    }

    public void showStates(){
        for(State state : this.states){
            System.out.println(state.getTitle());
            System.out.println(state.getId());
        }
    }

    public State showLatestState(){
        System.out.println(String.format("", ));
        return states.peek();
    }
}
