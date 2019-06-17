package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node node;

    public List preOrder(Node node) {

        ArrayList<Integer> list = new ArrayList<>();
        Node root = node;

        list.add(node.value);

        while (node.left != null) {
            list.add(node.left.value);
            node = node.left;
        }

        node = root;
        while (node.right != null) {
            list.add(node.right.value);
            node = node.right;
        }
        return list;
    }

    public int[] inOrder() {

        int[] arr = {1};
        return arr;
    }

    public int[] postOrder() {

        int[] arr = {1};
        return arr;
    }
}
