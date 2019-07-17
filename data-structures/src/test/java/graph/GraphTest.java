package graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
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

    @Test
    public void testGetEdges() {
        Graph graph = new Graph("x");
        String[] cities = new String[]{"Metroville", "Pandora"};
        String[] answer = new String[]{"True", "$82"};
        Graph node1 = graph.addNode("Pandora");
        Graph node2 = graph.addNode("Arendelle");
        Graph node3 = graph.addNode("Metroville");
        Graph node4 = graph.addNode("Monstropolis");
        Graph node5 = graph.addNode("Narnia");
        Graph node6 = graph.addNode("Naboo");
        graph.addEdge(node1, node2, 150);
        graph.addEdge(node2, node1, 150);
        graph.addEdge(node1, node3, 82);
        graph.addEdge(node3, node1, 82);
        graph.addEdge(node2, node4, 42);
        graph.addEdge(node4, node2, 42);
        graph.addEdge(node2, node3, 99);
        graph.addEdge(node3, node2, 99);
        graph.addEdge(node3, node5, 37);
        graph.addEdge(node5, node3, 37);
        graph.addEdge(node3, node6, 26);
        graph.addEdge(node6, node3, 26);
        graph.addEdge(node3, node4, 105);
        graph.addEdge(node4, node3, 105);
        graph.addEdge(node4, node6, 73);
        graph.addEdge(node6, node4, 73);
        graph.addEdge(node5, node6, 250);
        graph.addEdge(node6, node5, 250);
//        graph.getEdges(node3, cities);
        assertArrayEquals("Should return [True, $82]'", graph.getEdges(node3, cities), answer);
    }

    @Test
    public void testGetEdges3() {
        Graph graph = new Graph("x");
        String[] cities = new String[]{"Arendelle", "Monstropolis", "Naboo"};
        String[] answer = new String[]{"True", "$115"};
        Graph node1 = graph.addNode("Pandora");
        Graph node2 = graph.addNode("Arendelle");
        Graph node3 = graph.addNode("Metroville");
        Graph node4 = graph.addNode("Monstropolis");
        Graph node5 = graph.addNode("Narnia");
        Graph node6 = graph.addNode("Naboo");
        graph.addEdge(node1, node2, 150);
        graph.addEdge(node2, node1, 150);
        graph.addEdge(node1, node3, 82);
        graph.addEdge(node3, node1, 82);
        graph.addEdge(node2, node4, 42);
        graph.addEdge(node4, node2, 42);
        graph.addEdge(node2, node3, 99);
        graph.addEdge(node3, node2, 99);
        graph.addEdge(node3, node5, 37);
        graph.addEdge(node5, node3, 37);
        graph.addEdge(node3, node6, 26);
        graph.addEdge(node6, node3, 26);
        graph.addEdge(node3, node4, 105);
        graph.addEdge(node4, node3, 105);
        graph.addEdge(node4, node6, 73);
        graph.addEdge(node6, node4, 73);
        graph.addEdge(node5, node6, 250);
        graph.addEdge(node6, node5, 250);
        assertArrayEquals("Should return [True, $115]'", graph.getEdges(node2, cities), answer);
    }

    @Test
    public void testGetEdgesNone() {
        Graph graph = new Graph("x");
        String[] cities = new String[]{"Naboo", "Pandora"};
        String[] answer = new String[]{"False", "$0"};
        Graph node1 = graph.addNode("Pandora");
        Graph node2 = graph.addNode("Arendelle");
        Graph node3 = graph.addNode("Metroville");
        Graph node4 = graph.addNode("Monstropolis");
        Graph node5 = graph.addNode("Narnia");
        Graph node6 = graph.addNode("Naboo");
        graph.addEdge(node1, node2, 150);
        graph.addEdge(node2, node1, 150);
        graph.addEdge(node1, node3, 82);
        graph.addEdge(node3, node1, 82);
        graph.addEdge(node2, node4, 42);
        graph.addEdge(node4, node2, 42);
        graph.addEdge(node2, node3, 99);
        graph.addEdge(node3, node2, 99);
        graph.addEdge(node3, node5, 37);
        graph.addEdge(node5, node3, 37);
        graph.addEdge(node3, node6, 26);
        graph.addEdge(node6, node3, 26);
        graph.addEdge(node3, node4, 105);
        graph.addEdge(node4, node3, 105);
        graph.addEdge(node4, node6, 73);
        graph.addEdge(node6, node4, 73);
        graph.addEdge(node5, node6, 250);
        graph.addEdge(node6, node5, 250);
        assertArrayEquals("Should return [False, $0]'", graph.getEdges(node6, cities), answer);
    }
}
