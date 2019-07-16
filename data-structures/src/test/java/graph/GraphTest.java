package graph;

import org.junit.Test;

import java.util.List;

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
        Graph node3 = graph.addNode("node3");
        graph.addEdge(node1, node2, 2);
        graph.addEdge(node1, node3, 2);
        assertEquals("Should return Edge with weight 2", node1.neighbors.get(0).weight, 2);
    }

    @Test
    public void testOneEdge() {
        Graph graph = new Graph("test");
        Graph node1 = graph.addNode("node1");
        Graph node2 = graph.addNode("node2");
        graph.addEdge(node1, node2, 2);
        assertEquals("Should return Edge with weight 2", node1.neighbors.get(0).weight, 2);
    }

    @Test
    public void testGetNodes() {
        Graph graph = new Graph("test");
        Graph node1 = graph.addNode("node1");
        Graph node2 = graph.addNode("node2");
        graph.addEdge(node1, node2, 2);
        assertEquals("Should return node1 and node2 in a List", graph.getNodes().contains(node1), true);
        assertEquals("Should return node1 and node2 in a List", graph.getNodes().contains(node2), true);
    }

    @Test
    public void testGetNeighbors() {
        Graph graph = new Graph("test");
        Graph node1 = graph.addNode("node1");
        Graph node2 = graph.addNode("node2");
        graph.addEdge(node1, node2, 2);
        Graph node3 = graph.addNode("node2");
        graph.addEdge(node1, node3, 2);
        List tt  = graph.getNeighbors(node1);
        assertEquals("Should return node1 neighbor size of 2", graph.getNeighbors(node1).size(), 2);
    }

    @Test
    public void testSize() {
        Graph graph = new Graph("test");
        Graph node1 = graph.addNode("node1");
        Graph node2 = graph.addNode("node2");
        Graph node3 = graph.addNode("node3");
        Graph node4 = graph.addNode("node4");
        assertEquals("Should return size of 4", graph.size(), 4);
    }

    @Test
    public void testEmptyGraph() {
        Graph graph = new Graph("test");
        assertEquals("Should return null", graph.getNodes(), null);
    }

    @Test
    public void testBreadthFirst1node() {
        Graph graph = new Graph("test");
        Graph node1 = graph.addNode("node1");
        assertEquals("Should return a hash set size 1", graph.breadthFirst(node1).size(), 1);
    }

    @Test
    public void testBreadthFirst4nodes() {
        Graph graph = new Graph("node1");
        Graph node1 = graph.addNode("node2");
        Graph node2 = graph.addNode("node2");
        graph.addEdge(node1, node2, 2);
        Graph node3 = graph.addNode("node3");
        graph.addEdge(node1, node3, 2);
        assertEquals("Should return a hash set size 4", graph.breadthFirst(node1).size(), 4);
    }
}
