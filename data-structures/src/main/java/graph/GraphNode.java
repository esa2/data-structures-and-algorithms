package graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {
    String name;
    List<Edge> neighbors;

    public GraphNode(String name) {
        this.name = name;
        this.neighbors = new LinkedList<>();
    }

    public boolean isConnectedTo(GraphNode otherNode) {
        for (Edge e : this.neighbors) {
            if (e.node == otherNode) {
                return true;
            }
        }
        return false;
    }

    public void addNeighbor(GraphNode newNeighbor, int weight) {
        if (!this.isConnectedTo(newNeighbor)) {
            this.neighbors.add(new Edge(weight, newNeighbor));
            newNeighbor.neighbors.add(new Edge(weight, this));
        }
    }

    class Edge {
        int weight;
        GraphNode node;

        public Edge(int weight, GraphNode node) {
            this.weight = weight;
            this.node = node;
        }
    }
}
