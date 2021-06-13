public class main_hub {







    public static void main(String[] args){
        DFS test = new DFS();
        test.addState("s1", false);
        test.addState("s2", true);
        System.out.println(test.addTransition("start","s1","a"));
        System.out.println(test.addTransition("s1","s2","b"));
        System.out.println(test.execute("ab"));






    }
}
