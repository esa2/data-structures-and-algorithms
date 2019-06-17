package tree;

// source: https://www.baeldung.com/java-binary-tree

import java.util.ArrayList;

public class BinaryTree {
    Node node;
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> preOrder(Node node) {

        if (node != null) {
            list.add(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
        return list;
    }


    public ArrayList<Integer> inOrder(Node node) {

        if (node != null) {
            inOrder(node.left);
            list.add(node.value);
            inOrder(node.right);
        }
        return list;
    }

    public ArrayList<Integer> postOrder(Node node) {

        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            list.add(node.value);
        }
        return list;
    }
}
