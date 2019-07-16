package breadthFirst;

import graph.Graph;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void testAddNode() {
        Graph graph = new Graph("test");
        Graph node = graph.addNode("test node");
        assertEquals("Should", graph.addNode("test node"), 1);
    }
}
