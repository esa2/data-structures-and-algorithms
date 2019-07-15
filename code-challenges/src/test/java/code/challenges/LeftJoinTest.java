package code.challenges;

import org.junit.Test;

import java.util.HashMap;

public class LeftJoinTest {

    @Test
    public void lfTest() {
        LeftJoin lj = new LeftJoin();

        HashMap<String, String> syn = new HashMap<>();
        syn.put("fond", "enamored");
        syn.put("wrath", "anger");
        syn.put("diligent", "employed");
        syn.put("outfit", "garb");
        syn.put("guide", "usher");

        HashMap<String, String> ant = new HashMap<>();

        ant.put("fond", "averse");
        ant.put("wrath", "delight");
        ant.put("diligent", "idle");
        ant.put("guide", "follow");
        ant.put("flow", "jam");
    }
}
