import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** supercalss for all automata. Implements a Map
 * to store states and transitions.
 */

public class automaton {
    public Map<String, State> states = new HashMap<>();
    public Map<State, Map<Character, List<Transition_Interface>>> transitions = new HashMap<>();

    public void automaton(){


    }

    public void add_state(String name, State state){
        states.put(name,state);
    }
    public void add_state(State state){
        states.put(state.name,state);
        transitions.put(state,new HashMap<>());
    }
    public boolean add_transition(State start_state, State end_state, Character condition){
        DFA_Transition new_trans = new DFA_Transition(end_state, condition);
        if(transitions.get(start_state).isEmpty()){
            ArrayList<Transition_Interface> new_arr = new ArrayList<>();
            new_arr.add(new_trans);
            transitions.get(start_state).put(condition, new_arr);
        }
        else {
            List<Transition_Interface> trans_check = transitions.get(start_state).get(condition);
            //
            //        if(trans_check.isEmpty()){
            //            ArrayList<Transition_Interface> new_arr = new ArrayList<>();
            //            new_arr.add(new_trans);
            //            transitions.get(start_state).put(condition, new_arr);
            //        }

            trans_check.add(new_trans);

        }
        return true;
    }


    public boolean simulate(State state, String input ){


        if(input.equals("")){

            return state.isAccept();
        }
        List<Transition_Interface> trans = transitions.get(state).get(input.charAt(0));
        for (Transition_Interface i : trans){
            if(i.execute(this,input.substring(1))){
                return true;
            }

        }
        return false;
    }




}
