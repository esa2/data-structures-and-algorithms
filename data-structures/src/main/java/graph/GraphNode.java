package graph;

import java.util.*;

public class GraphNode {
    String name;
    List<Edge> neighbors;
    ArrayList<GraphNode> nodeList = new ArrayList<>();

    public List<Edge> getNeighbors() {
        return neighbors;
    }

    public GraphNode(String name) {
        this.name = name;
        this.neighbors = new LinkedList<>();
    }

    public GraphNode addNode(String name) {
        GraphNode node = new GraphNode(name);
        nodeList.add(node);
        return node;
    }

    public void addEdge(GraphNode node1, GraphNode node2, int weight) {
        if (!this.isConnectedTo(node2)) {
            node1.neighbors.add(new Edge(weight, node2));
            node2.neighbors.add(new Edge(weight, this));
        }
    }

    public ArrayList getNodes() {

        if (nodeList.size() == 0) return null;
        return nodeList;
    }

    public List getNeighbors(GraphNode node) {
        return node.neighbors;
    }

    public int size() {
        return nodeList.size();
    }

    public boolean isConnectedTo(GraphNode otherNode) {
        for (Edge e : this.neighbors) {
            if (e.node == otherNode) {
                return true;
            }
        }
        return false;
    }

    public HashSet breadthFirst(GraphNode start) {

        HashSet<GraphNode> visited = new HashSet<>();
        Queue<GraphNode> toBeCounted = new LinkedList<>();
        toBeCounted.add(start);
        visited.add(start);

        while (!toBeCounted.isEmpty()) {
            GraphNode current = toBeCounted.remove();

            for (GraphNode.Edge neighbor : current.neighbors) {

                if (!visited.contains(neighbor)) {
                    toBeCounted.add(neighbor.node);
                    visited.add(neighbor.node);
                }
            }
        }
        for (GraphNode node : visited) {
            System.out.println("Node name: " + node.name);
        }
        return visited;
    }

    public String[] getEdges(GraphNode node, String[] cities) {
        String[] returnArray = new String[2];
        int i = 1;
        int price = 0;
        boolean edgeFound = false;

                while (i < cities.length) {
                    for (GraphNode.Edge ele : node.neighbors) {

                        if (ele.node.name == cities[i]) {
                            node = ele.node;
                            price += ele.weight;
                            returnArray[0] = "True";
                            returnArray[1] = "$" + price;
                            edgeFound = true;
                        }
                    }
                    i++;
                }
                if (!edgeFound) return new String[]{"False", "$0"};
        return returnArray;
    }

    public LinkedList depthFirst(GraphNode start) {

        LinkedList<GraphNode> visited = new LinkedList<>();
        LinkedList<GraphNode> toBeCounted = new LinkedList<>();
        toBeCounted.push(start);
        visited.add(start);

        while (!toBeCounted.isEmpty()) {
            GraphNode current = toBeCounted.pop();

            for (GraphNode.Edge neighbor : current.neighbors) {

                if (!visited.contains(neighbor)) {
                    if (neighbor.node.name != "x") {
                        toBeCounted.push(neighbor.node);
                        visited.add(neighbor.node);
                    }
                }
            }
        }


        for (GraphNode node : visited) {
            System.out.println("Node name: " + node.name);
        }
        return visited;
    }

    public class Edge {
        int weight;
        GraphNode node;

        public GraphNode getNode() {
            return node;
        }

        public Edge(int weight, GraphNode node) {
            this.weight = weight;
            this.node = node;
        }
    }
}