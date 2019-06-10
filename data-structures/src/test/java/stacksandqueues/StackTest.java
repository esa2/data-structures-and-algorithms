package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testStackClassNode() {
        Stack  newStack = new Stack();
        assertTrue("Should create empty stack", newStack.top == null);
    }

    @Test
    public void testStackClassPush() {
        Stack  newStack = new Stack();
        newStack.push(1);
        assertEquals("Should push a new node on stack", newStack.top.value, 1);
    }

    @Test
    public void testStackClassPop() {
        Stack  newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        assertEquals("Should pop node with value 2", newStack.pop(), 2);
        assertEquals("Node with value 1 should now be top", newStack.top.value, 1);
    }

    @Test
    public void testStackClassPeek() {
        Stack  newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        assertEquals("Second node pushed should be top of stack", newStack.peek(), 2);
    }
}
