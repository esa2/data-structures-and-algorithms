package treeIntersection;

import tree.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection {
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

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> preOrder(Node node) {

        if (node != null) {
            list.add(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
        return list;
    }

    public ArrayList<Integer> compare(Node root1, Node root2) {
        HashMap<Integer, Integer> map = new HashMap<>(1024);
        ArrayList<Integer> duplicates = new ArrayList<>();

        ArrayList<Integer> list1 = preOrder(root1);

        list = new ArrayList<>();
        ArrayList<Integer> list2 = preOrder(root2);


        for (int ele : list1) {
            map.put(ele, ele);
        }

        for (int ele : list2) {
            if (map.containsKey(ele)) {
                duplicates.add(ele);
            }
        }
        return duplicates;
    }
}
