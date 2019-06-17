package tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testBst() {
        BinarySearchTree bst = new BinarySearchTree();
        assertNull("Should instantiate an empty tree", bst.node);
    }

    @Test
    public void testRootNode() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        assertEquals("Should instantiate a tree with a single root node", bst.node.value, 10);
    }

    @Test
    public void testLeftAndRightNode() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(5);
        bst.add(15);
        assertEquals("Should add a left child and right child to a single root node", bst.node.left.value, 5);
        assertEquals("Should add a left child and right child to a single root node", bst.node.right.value, 15);
    }

    @Test
    public void testContains() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(5);
        assertTrue("Should find node with value 5", bst.contains(5));
    }

    @Test
    public void testPreOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(2);
        list.add(15);
        list.add(25);
        list.add(26);
        BinarySearchTree bst = new BinarySearchTree();
        BinaryTree bt = new BinaryTree();
        bst.add(10);
        bst.add(5);
        bst.add(2);
        bst.add(15);
        bst.add(25);
        bst.add(26);
        bt.preOrder(bst.node);
        assertEquals("Should return a collection from a preOrder traversal", bt.preOrder(bst.node), list);
    }
}
