package tree;

import org.junit.Test;

import static org.junit.Assert.assertNull;

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
}
