package graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphTest {

    @Test
    public void testAddNode() {
        
        Graph graph = new Graph();
        GraphNode node = graph.addNode("test node");
        assertEquals("Should return a node named test node", graph.addNode("test node").name, node.name);
    }
}
