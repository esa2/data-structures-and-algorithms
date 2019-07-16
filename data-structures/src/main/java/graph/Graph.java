package graph;

import java.util.ArrayList;

public class Graph {

    public GraphNode addNode(String name) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        GraphNode node = new GraphNode(name);
        nodeList.add(node);
        return node;
    }
}
