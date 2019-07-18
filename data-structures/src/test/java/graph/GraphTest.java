package graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GraphTest {

    @Test
    public void testAddNode() {
        GraphNode graph = new GraphNode("test");
        GraphNode node = graph.addNode("test node");
        assertEquals("Should return a node named test node", graph.addNode("test node").name, node.name);
    }

    @Test
    public void testAddEdge() {
        GraphNode graph = new GraphNode("test");
        GraphNode node1 = graph.addNode("node1");
        GraphNode node2 = graph.addNode("node2");
        GraphNode node3 = graph.addNode("node3");
        graph.addEdge(node1, node2, 2);
        graph.addEdge(node1, node3, 2);
        assertEquals("Should return Edge with weight 2", node1.neighbors.get(0).weight, 2);
    }

    @Test
    public void testOneEdge() {
        GraphNode graph = new GraphNode("test");
        GraphNode node1 = graph.addNode("node1");
        GraphNode node2 = graph.addNode("node2");
        graph.addEdge(node1, node2, 2);
        assertEquals("Should return Edge with weight 2", node1.neighbors.get(0).weight, 2);
    }

    @Test
    public void testGetNodes() {
        GraphNode graph = new GraphNode("test");
        GraphNode node1 = graph.addNode("node1");
        GraphNode node2 = graph.addNode("node2");
        graph.addEdge(node1, node2, 2);
        assertEquals("Should return node1 and node2 in a List", graph.getNodes().contains(node1), true);
        assertEquals("Should return node1 and node2 in a List", graph.getNodes().contains(node2), true);
    }

    @Test
    public void testGetNeighbors() {
        GraphNode graph = new GraphNode("test");
        GraphNode node1 = graph.addNode("node1");
        GraphNode node2 = graph.addNode("node2");
        graph.addEdge(node1, node2, 2);
        GraphNode node3 = graph.addNode("node2");
        graph.addEdge(node1, node3, 2);
        List tt  = graph.getNeighbors(node1);
        assertEquals("Should return node1 neighbor size of 2", graph.getNeighbors(node1).size(), 2);
    }

    @Test
    public void testSize() {
        GraphNode graph = new GraphNode("test");
        GraphNode node1 = graph.addNode("node1");
        GraphNode node2 = graph.addNode("node2");
        GraphNode node3 = graph.addNode("node3");
        GraphNode node4 = graph.addNode("node4");
        assertEquals("Should return size of 4", graph.size(), 4);
    }

    @Test
    public void testEmptyGraph() {
        GraphNode graph = new GraphNode("test");
        assertEquals("Should return null", graph.getNodes(), null);
    }

    @Test
    public void testBreadthFirst1node() {
        GraphNode graph = new GraphNode("test");
        GraphNode node1 = graph.addNode("node1");
        assertEquals("Should return a hash set size 1", graph.breadthFirst(node1).size(), 1);
    }

    @Test
    public void testBreadthFirst4nodes() {
        GraphNode graph = new GraphNode("node1");
        GraphNode node1 = graph.addNode("node2");
        GraphNode node2 = graph.addNode("node2");
        graph.addEdge(node1, node2, 2);
        GraphNode node3 = graph.addNode("node3");
        graph.addEdge(node1, node3, 2);
        assertEquals("Should return a hash set size 4", graph.breadthFirst(node1).size(), 4);
    }

    @Test
    public void testGetEdges() {
        GraphNode graph = new GraphNode("x");
        String[] cities = new String[]{"Metroville", "Pandora"};
        String[] answer = new String[]{"True", "$82"};
        GraphNode node1 = graph.addNode("Pandora");
        GraphNode node2 = graph.addNode("Arendelle");
        GraphNode node3 = graph.addNode("Metroville");
        GraphNode node4 = graph.addNode("Monstropolis");
        GraphNode node5 = graph.addNode("Narnia");
        GraphNode node6 = graph.addNode("Naboo");
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
        GraphNode graph = new GraphNode("x");
        String[] cities = new String[]{"Arendelle", "Monstropolis", "Naboo"};
        String[] answer = new String[]{"True", "$115"};
        GraphNode node1 = graph.addNode("Pandora");
        GraphNode node2 = graph.addNode("Arendelle");
        GraphNode node3 = graph.addNode("Metroville");
        GraphNode node4 = graph.addNode("Monstropolis");
        GraphNode node5 = graph.addNode("Narnia");
        GraphNode node6 = graph.addNode("Naboo");
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
        GraphNode graph = new GraphNode("x");
        String[] cities = new String[]{"Naboo", "Pandora"};
        String[] answer = new String[]{"False", "$0"};
        GraphNode node1 = graph.addNode("Pandora");
        GraphNode node2 = graph.addNode("Arendelle");
        GraphNode node3 = graph.addNode("Metroville");
        GraphNode node4 = graph.addNode("Monstropolis");
        GraphNode node5 = graph.addNode("Narnia");
        GraphNode node6 = graph.addNode("Naboo");
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

    @Test
    public void testDepthFirst() {
        GraphNode graph = new GraphNode("x");
        GraphNode nodeA = graph.addNode("A");
        GraphNode nodeB = graph.addNode("B");
        GraphNode nodeC = graph.addNode("C");
        GraphNode nodeD = graph.addNode("D");
        GraphNode nodeE = graph.addNode("E");
        GraphNode nodeF = graph.addNode("F");
        GraphNode nodeG = graph.addNode("G");
        GraphNode nodeH = graph.addNode("H");
        graph.addEdge(nodeA, nodeB, 1);
        graph.addEdge(nodeB, nodeC, 1);
        graph.addEdge(nodeC, nodeG, 1);
        graph.addEdge(nodeB, nodeD, 1);
        graph.addEdge(nodeD, nodeE, 1);
        graph.addEdge(nodeD, nodeH, 1);
        graph.addEdge(nodeD, nodeF, 1);
        assertEquals("Should", graph.depthFirst(nodeA).size(), 8);
    }
}
