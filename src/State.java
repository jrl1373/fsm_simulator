import java.util.ArrayList;

public class State {
    public String name;
    private boolean accept;
    private ArrayList<Transition> transitions = new ArrayList<>();

    public State(String name){
        this.name = name;
        accept = false;

    }
    public State(String name, boolean accept){
        this.name = name;
        this.accept = accept;
    }

    public boolean add_transition(State end, String cond) {
        //checks that new transition doesn't override any old transition
        for (int i = 0; i < transitions.size(); i++) {
            Transition temp = transitions.get(i);
            if (temp.checkcondition(cond)) {
                return false;
            }
        }
        transitions.add(new Transition(this, end, cond));
        return true;
    }
    public State next_state(String input){
        for(int i=0; i < transitions.size();i++){
            Transition temp = transitions.get(i);
            if(temp.checkcondition(input)){
                return temp.getEnd();
            }
        }
        return null;
    }

    public boolean isAccept() {
        return accept;
    }
}
