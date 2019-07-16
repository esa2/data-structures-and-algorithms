package graph;

import java.util.*;

public class Graph {
    String name;
    List<Edge> neighbors;
    ArrayList<Graph> nodeList = new ArrayList<>();

    public List<Edge> getNeighbors() {
        return neighbors;
    }

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

        if (nodeList.size() == 0) return null;
        return nodeList;
    }

    public List getNeighbors(Graph node) {
        return node.neighbors;
    }

    public int size() {
        return nodeList.size();
    }

    public boolean isConnectedTo(Graph otherNode) {
        for (Edge e : this.neighbors) {
            if (e.node == otherNode) {
                return true;
            }
        }
        return false;
    }

    public HashSet breadthFirst(Graph start) {

        HashSet<Graph> visited = new HashSet<>();
        Queue<Graph> toBeCounted = new LinkedList<>();
        toBeCounted.add(start);
        visited.add(start);
        int ans = 0;

        while (!toBeCounted.isEmpty()) {
            Graph current = toBeCounted.remove();
            ans++;

            for (Graph.Edge neighbor : current.neighbors) {

                if (!visited.contains(neighbor)) {
                    toBeCounted.add(neighbor.node);
                    visited.add(neighbor.node);
                }
            }
        }
        for (Graph node : visited) {
            System.out.println("Node name: " + node.name);
        }

        return visited;
    }

    public class Edge {
        int weight;
        Graph node;

        public Graph getNode() {
            return node;
        }

        public Edge(int weight, Graph node) {
            this.weight = weight;
            this.node = node;
        }
    }
}