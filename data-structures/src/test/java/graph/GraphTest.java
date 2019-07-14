package graph;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class GraphTest {

    @Test
    public void testGraphSize() {

        int size = 3;
        Graph graph = new Graph(size);
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0, 1);
        ll.add(0, 2);
        ll.add(1, 2);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 2);
        assertEquals("Should", graph.addEdge(graph,1, 2), ll.size());
    }
}
