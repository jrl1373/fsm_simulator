public class TM_Transition implements Transition_Interface {
    private Character tape_input;


    @Override
    public boolean execute(automaton a, String input) {

        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return tape_input.hashCode();
    }
}
