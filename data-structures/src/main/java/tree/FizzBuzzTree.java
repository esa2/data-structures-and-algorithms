package tree;

public class FizzBuzzTree {
    Node node;

    public class Node {
        String value;
        Node left;
        Node right;

        Node(String value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void add(String value) {
        node = addRecursive(node, value);
    }

    private Node addRecursive(Node current, String  value) {

        if (current == null) return new Node(value);

        if (Integer.parseInt(value) < Integer.parseInt(current.value)) {
            current.left = addRecursive(current.left, value);
        } else if (Integer.parseInt(value) > Integer.parseInt(current.value)) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public Node fizz(Node node) {

        if (node != null) {
            if (Integer.parseInt(node.value) % 15 == 0) {
                node.value = "FizzBuzz";
            } else if (Integer.parseInt(node.value) % 5 == 0) {
                node.value = "Buzz";
            } else if (Integer.parseInt(node.value) % 3 == 0) {
                node.value = "Fizz";
            }
            fizz(node.left);
            fizz(node.right);
        }
        return node;
    }
}
