import java.util.HashMap;
import java.util.List;

/**
 *  any FSA should have these states,
 *  the interface could help with polymporphism
 *
 */
public interface automata {
    /**
     * transitions is a HashMap used to traverse states. each State points to
     * another HashMap that
     */
   HashMap<State, HashMap<Character, List<Transition>>> transitions = new HashMap<>();


    abstract public void addState();
    abstract public void addTransition();

}
