package code.challenges;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void lfTestHappyPath() {
        LeftJoin lj = new LeftJoin();
        String[][] arraysTest = new String[5][];
        String[] arr0 = new String[]{"diligent", "employed", "idle"};
        String[] arr1 = new String[]{"outfit", "garb", null};
        String[] arr2 = new String[]{"wrath", "anger", "delight"};
        String[] arr3 = new String[]{"guide", "usher", "follow"};
        String[] arr4 = new String[]{"fond", "enamored", "averse"};

        arraysTest[0] = arr0;
        arraysTest[1] = arr1;
        arraysTest[2] = arr2;
        arraysTest[3] = arr3;
        arraysTest[4] = arr4;

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

        assertArrayEquals("Should return array of arrays with values from both hash-maps",lj.leftJoin(syn, ant), arraysTest);
    }

    @Test
    public void lfTestEdge1() {
        LeftJoin lj = new LeftJoin();
        String[][] arraysTest = new String[1][];
        String[] arr0 = new String[]{"diligent", "employed", "idle"};

        arraysTest[0] = arr0;

        HashMap<String, String> syn = new HashMap<>();
        syn.put("diligent", "employed");

        HashMap<String, String> ant = new HashMap<>();
        ant.put("diligent", "idle");

        assertArrayEquals("Should return array of arrays with one key/value/value from hash-map",lj.leftJoin(syn, ant), arraysTest);
    }

    @Test
    public void lfTestEdge2() {
        LeftJoin lj = new LeftJoin();
        String[][] arraysTest = new String[1][];
        String[] arr0 = new String[]{"diligent", "employed", null};

        arraysTest[0] = arr0;

        HashMap<String, String> syn = new HashMap<>();
        syn.put("diligent", "employed");

        HashMap<String, String> ant = new HashMap<>();
        ant.put("notFound", "idle");

        assertArrayEquals("Should return array of arrays with one key/value/null from hash-map",lj.leftJoin(syn, ant), arraysTest);
    }
}
