package tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void testFbt() {
        FizzBuzzTree fbt = new FizzBuzzTree();
        assertNull("Should instantiate an empty tree", fbt.node);
    }

    @Test
    public void testRootNode() {
        FizzBuzzTree fbt = new FizzBuzzTree();
        fbt.add("10");
        assertEquals("Should instantiate a tree with a single root node", fbt.node.value, "10");
    }

    @Test
    public void testAllNodes() {
        FizzBuzzTree fbt = new FizzBuzzTree();
        fbt.add("15");
        fbt.add("5");
        fbt.add("3");
        fbt.add("18");
        fbt.add("25");
        fbt.add("26");
        FizzBuzzTree.Node node = fbt.fizz(fbt.node);
        assertEquals("15 Should be FizzBuzz", node.value, "FizzBuzz");
        assertEquals("5 Should be Buzz", node.left.value, "Buzz");
        assertEquals("3 Should be Fizz", node.left.left.value, "Fizz");
        assertEquals("18 Should be Fizz", node.right.value, "Fizz");
        assertEquals("25 Should be Buzz", node.right.right.value, "Buzz");
        assertEquals("26 Should be 26", node.right.right.right.value, "26");
    }
}
