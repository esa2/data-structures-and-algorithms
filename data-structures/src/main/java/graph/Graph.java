package graph;

import java.util.LinkedList;

public class Graph {

    int size;
    LinkedList<Integer> adjListArray[];

    Graph(int size) {
        this.size = size;
        adjListArray = new LinkedList[size]; // set size of array to # of nodes

        for (int i = 0; i < size ; i++) { // create linked list for each node
            adjListArray[i] = new LinkedList<>();
        }
    }

    public int addEdge(Graph graph, int src, int dest) {

        graph.adjListArray[src].add(dest);
        graph.adjListArray[dest].add(src);
        System.out.println("wat " + graph.adjListArray[0]);
        return adjListArray.length;
    }
}


