public class main_hub {







    public static void main(String[] args){


        /** testing of the DFA, creates two states, adds transitions between the states
         *  and then executes a valid input.
         *
         *  Problems: states are created within the DFA class, States are pretty universal
         *  and a better solution would be to have states created outside of the DFA
         *  Same thing could be said for transitions. Doing this would lower coupling
         */
//        DFA test = new DFA();
//        test.addState("s1", false);
//        test.addState("s2", true);
//        System.out.println(test.addTransition("start","s1","a"));
//        System.out.println(test.addTransition("s1","s2","b"));
//        System.out.println(test.execute("ab"));
//


        State start = new State("start", false);
        State end = new State("end", true);
        State middle = new State("2", false);
        automaton test = new automaton();
        test.add_state(start);
        test.add_state(end);
        test.add_state(middle);
        System.out.println(test.add_transition(start,middle, 'a'));
        test.add_transition(middle,end, 'b');
        System.out.println(test.transitions);
        System.out.println(test.simulate(start,"ab"));




    }
}
