# Lab: Graph Implementation

Implement a Graph
***

## Challenge

The graph should be represented as an adjacency list, and should include the following methods:

AddNode()
- Adds a new node to the graph
Takes in the value of that node
Returns the added node

AddEdge()
- Adds a new edge between two nodes in the graph
Include the ability to have a “weight”
Takes in the two nodes to be connected by the edge
Both nodes should already be in the Graph

GetNodes()
- Returns all of the nodes in the graph as a collection (set, list, or similar)
GetNeighbors()
Returns a collection of nodes connected to the given node
Takes in a given node
Include the weight of the connection in the returned collection

Size()
- Returns the total number of nodes in the graph
***

## Approach & Efficiency

Approach:

- Use a linked list of neighbors to hold neighbor nodes. Use a List to hold edges

Efficiency:

- Adding a node is O(1) time using the List add method and O(1) space

- Adding an edge is O(1) time as it adds to the begining of a linked list. It os O(1) space as well for the one or two nodes added.

- GetNeighbors is O(1) time as all nodes in the neighbor linked list are simply returned

- The isConnecedTo method is O(n) as it iterates over the neighbor linked list to check for connections.