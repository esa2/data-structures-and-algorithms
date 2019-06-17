package tree;

import org.junit.Test;

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
}
