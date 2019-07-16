package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    String name;
    List<Edge> neighbors;
    ArrayList<Graph> nodeList = new ArrayList<>();

    public Graph(String name) {
        this.name = name;
        this.neighbors = new LinkedList<>();
    }

    public Graph addNode(String name) {
        Graph node = new Graph(name);
        nodeList.add(node);
        return node;
    }

    public void addEdge(Graph node1, Graph node2, int weight) {
        if (!this.isConnectedTo(node2)) {
            node1.neighbors.add(new Edge(weight, node2));
            node2.neighbors.add(new Edge(weight, this));
        }
    }

    public ArrayList getNodes() {
        return nodeList;
    }

    public boolean isConnectedTo(Graph otherNode) {
        for (Edge e : this.neighbors) {
            if (e.node == otherNode) {
                return true;
            }
        }
        return false;
    }

    class Edge {
        int weight;
        Graph node;

        public Edge(int weight, Graph node) {
            this.weight = weight;
            this.node = node;
        }
    }
}
