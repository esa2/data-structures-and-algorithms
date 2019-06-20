package tree;

// source: https://www.baeldung.com/java-binary-tree

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    public void breadthFirstTraversal(Node root) {

        Queue<Node> ll = new LinkedList<>();

        ll.add(root);

        while (!ll.isEmpty()) {
            Node node = ll.remove();
            System.out.print(" " + node.value);

            if (node.left != null) {
                ll.add(node.left);
            }
            if (node.right != null) {
                ll.add(node.right);
            }
        }
    }

    public int findMaximunValue(Node node) {

        int max = 0;

        if (node != null) {
            if (node.value > max) max = node.value;

            int leftValue = findMaximunValue(node.left);
            int rightValue = findMaximunValue(node.right);

            if (leftValue > max) max = leftValue;
            if (rightValue > max) max = rightValue;
        }
        return max;
    }
}



