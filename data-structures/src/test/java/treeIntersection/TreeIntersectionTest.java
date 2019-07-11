package treeIntersection;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TreeIntersectionTest {

    @Test
    public void testIntersection() {
        TreeIntersection ti1 = new TreeIntersection();
        ti1.add(10);
        ti1.add(5);
        ti1.add(2);
        ti1.add(6);
        ti1.add(15);
        ti1.add(12);
        ti1.add(25);
        TreeIntersection ti2 = new TreeIntersection();
        ti2.add(10);
        ti2.add(1);
        ti2.add(55);
        ti2.add(65);
        ti2.add(6);
        ArrayList<Integer> dups = new ArrayList<>();
        dups.add(10);
        dups.add(6);
        assertEquals("Should return 10 and 6", ti1.compare(ti1.node, ti2.node), dups);
    }

    @Test
    public void testIntersectionEqual() {
        // equal trees test
        TreeIntersection ti1 = new TreeIntersection();
        ti1.add(1);
        ti1.add(2);
        ti1.add(3);
        ti1.add(4);
        ti1.add(5);
        ti1.add(6);
        ti1.add(7);
        TreeIntersection ti2 = new TreeIntersection();
        ti2.add(7);
        ti2.add(6);
        ti2.add(5);
        ti2.add(4);
        ti2.add(3);
        ti2.add(2);
        ti2.add(1);
        ArrayList<Integer> dups = new ArrayList<>();
        dups.add(7);
        dups.add(6);
        dups.add(5);
        dups.add(4);
        dups.add(3);
        dups.add(2);
        dups.add(1);
        assertEquals("Should return all nodes", ti1.compare(ti1.node, ti2.node), dups);
    }

    @Test
    public void testIntersectionEdge() {
        // root nodes match
        TreeIntersection ti1 = new TreeIntersection();
        ti1.add(10);
        TreeIntersection ti2 = new TreeIntersection();
        ti2.add(10);
        ArrayList<Integer> dups = new ArrayList<>();
        dups.add(10);
        assertEquals("Should return 10", ti1.compare(ti1.node, ti2.node), dups);
    }

    @Test
    public void testIntersectionNoDups() {
        // no duplicates
        TreeIntersection ti1 = new TreeIntersection();
        ti1.add(10);
        ti1.add(5);
        ti1.add(2);
        ti1.add(6);
        ti1.add(15);
        ti1.add(12);
        ti1.add(25);
        TreeIntersection ti2 = new TreeIntersection();
        ti2.add(88);
        ti2.add(1);
        ti2.add(55);
        ti2.add(65);
        ti2.add(87);
        ArrayList<Integer> dups = new ArrayList<>();
        assertEquals("Should return empty list", ti1.compare(ti1.node, ti2.node), dups);
    }
}
