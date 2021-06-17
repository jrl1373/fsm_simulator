import java.util.HashMap;


/** the DFS class has simple nodes that
 * are either accept, or not, and has a clearly defined branch for each outcome.
 * because of this, checks for invalid placements must occur before running or else
 * it is not a DFS
 *
 */
public class DFA {
    private State start_state;
    private State current_state;
    private HashMap<String,State> states = new HashMap<>();



    public DFA(){
        this.start_state = new State("start");
        states.put("start",start_state);
    }


    /**
     * executes DFS given a string
     *
     * @param input the string that will be executed
     *
     */
    public boolean execute(String input){
        current_state = start_state;
        for(int i = 0; i < input.length(); i++){
            System.out.println(current_state);
            current_state = current_state.next_state(input.substring(i,i+1));
            System.out.println(current_state);
            if(current_state == null){
                return false;
            }
        }
        return current_state.isAccept();
    }

    public void addState(String name, boolean accept){
        states.put(name,new State(name,accept));
    }

    public boolean addTransition(String state1, String state2, String cond){
        State start = states.get(state1);
        if(start == null){
            return false;
        }
        State end = states.get(state2);
        if(end == null){
            return false;
        }
        start.add_transition(end,cond);
        return true;
    }





}
