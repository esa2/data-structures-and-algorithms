package graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphTest {

    @Test
    public void testAddNode() {
        Graph graph = new Graph("test");
        Graph node = graph.addNode("test node");
        assertEquals("Should return a node named test node", graph.addNode("test node").name, node.name);
    }

    @Test
    public void testAddEdge() {
        Graph graph = new Graph("test");
        Graph node1 = graph.addNode("node1");
        Graph node2 = graph.addNode("node2");
        graph.addEdge(node1, node2, 2);
        assertEquals("Should return Edge with weight 2", node1.neighbors.get(0).weight, 2);
    }
}
