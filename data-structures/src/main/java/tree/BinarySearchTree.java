package tree;

// source: https://www.baeldung.com/java-binary-tree

public class BinarySearchTree {
    Node node;

    public void add(int value) {
        node = addRecursive(node, value);
    }

    public Node addRecursive(Node current, int value) {

        if (current == null) return new Node(value);

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }
}
