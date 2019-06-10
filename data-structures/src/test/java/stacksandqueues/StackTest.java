package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*
;
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
}
