package tree;

public class TreeDouble {
    Node node;


    public Node doubleValueNewTree(Node node) {

        if (node == null) return null;
            Node newNode = new Node(1);

            newNode.value = node.value * 2;
            newNode.left = doubleValueNewTree(node.left);
            newNode.right = doubleValueNewTree(node.right);
            return newNode;
    }

    public Node doubleValueInPlace(Node root) {

        if (root != null) {
            root.value = root.value * 2;
            doubleValueInPlace(root.left);
            doubleValueInPlace(root.right);
        }
        return root;
    }

    public void inOrderPrint(Node node) {

        if (node == null) return;
            // prints in order as inOrder added to stack
            System.out.print(" " + node.value + " ");
            inOrderPrint(node.left);
            inOrderPrint(node.right);
            // prints last nodes first as inOrder pops off stack
//            System.out.print(" " + node.value + " ");

    }

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
}
