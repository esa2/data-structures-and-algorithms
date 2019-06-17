package tree;

// source: https://www.baeldung.com/java-binary-tree

import java.util.ArrayList;

public class BinaryTree {
    Node node;
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> preOrder(Node node) {

        if (node != null) {
            System.out.print(" " + node.value);

            list.add(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
        return list;
    }


    public ArrayList<Integer> inOrder(Node node) {

      
        return list;
    }

    public ArrayList<Integer> postOrder(Node node) {


        return list;
    }
}
