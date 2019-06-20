package tree;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testBst() {
        BinarySearchTree bst = new BinarySearchTree();
        assertNull("Should instantiate an empty tree", bst.node);
    }

    @Test
    public void testBreadthFirst() {
        BinarySearchTree bst = new BinarySearchTree();
        BinaryTree bt = new BinaryTree();
        bst.add(10);
        bst.add(5);
        bst.add(2);
        bst.add(6);
        bst.add(15);
        bst.add(12);
        bst.add(25);
        bt.breadthFirstTraversal(bst.node);
    }

    @Test
    public void testFindMax() {
        BinarySearchTree bst = new BinarySearchTree();
        BinaryTree bt = new BinaryTree();
        bst.add(10);
        bst.add(5);
        bst.add(2);
        bst.add(6);
        bst.add(15);
        bst.add(12);
        bst.add(25);
        assertEquals("Should return max value 25", bt.findMaximunValue(bst.node), 25);
    }

    @Test
    public void testFindMaxEdgeCase() {
        BinarySearchTree bst = new BinarySearchTree();
        BinaryTree bt = new BinaryTree();
        bst.add(10);
        assertEquals("Should return max value 10", bt.findMaximunValue(bst.node), 10);
    }

    @Test
    public void testFindMaxEdgeNull() {
        BinarySearchTree bst = new BinarySearchTree();
        BinaryTree bt = new BinaryTree();
        assertEquals("Should return 0 when argument is empty tree", bt.findMaximunValue(bst.node), 0);
    }
}
