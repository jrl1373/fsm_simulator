public class Transition {
private State start;
private State end;
private String condition;


    public Transition(State start, State end, String condition){
        this.start = start;
        this.end = end;
        this.condition = condition;


    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean checkcondition(String input){
        return input.equals(condition);
    }

    public State getEnd(){
        return end;
    }





}



