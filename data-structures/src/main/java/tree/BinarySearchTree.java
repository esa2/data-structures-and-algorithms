package tree;

// source: https://www.baeldung.com/java-binary-tree

public class BinarySearchTree {
    Node node;

    public void add(int value) {
        node = addRecursive(node, value);
    }

    private Node addRecursive(Node current, int value) {

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

    public boolean contains(int value) {
        return containsRecursive(node, value);
    }

    private boolean containsRecursive(Node current, int value) {
        boolean rv;

        if (current == null) return false;

        if (current.value == value) return true;

        if (value < current.value) {
            rv = containsRecursive(current.left, value);
        } else {
            rv = containsRecursive(current.right, value);
        }
        return rv;
    }
}
