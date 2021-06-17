


public class DFA_Transition implements Transition_Interface {
    private Character transition;
    private State end_state;


    public DFA_Transition(State trans, Character transition){
        this.transition = transition;
        this.end_state = trans;
    }

    @Override
    public boolean execute(automaton a, String input) {

        if(input.equals("")){

            return end_state.isAccept();
        }
        return a.simulate(end_state,input);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return transition.hashCode();
    }

    @Override
    public String toString() {
        return transition + "->" + end_state;
    }
}
