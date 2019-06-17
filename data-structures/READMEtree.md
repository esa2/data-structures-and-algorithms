## Lab Binary Tree and BST Implementation ##
***

**Node Class:**
- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

**BinaryTree class:**
- Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.

**BinarySearchTree class:**
- Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
- Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

**Approach & Efficiency**
- All 3 depth first traversals have a time complexity of O(n) as every node is visited.
- The 2 BST methods are both O(log n) as they do not need to visit all nodes but in essence keep halving the tree.
***

[See the Node Class](src/main/java/tree/Node.java)

[See the Binary Tree Class](src/main/java/tree/BinaryTree.java)

[See the Binary Search Tree Class](src/main/java/tree/BinarySearchTree.java)

[See the Test Class](src/test/java/tree/BinarySearchTreeTest.java)
