package stacksandqueues;

import org.junit.Test;

public class PseudoQueueTest {

    @Test
    public void testStackClassPush() {
        PseudoQueue newPseudoQueue = new PseudoQueue();
        newPseudoQueue.enqueue(5);

        System.out.println(newPseudoQueue.stack2.peek());
        System.out.println( newPseudoQueue.stack2.pop());
        System.out.println(newPseudoQueue.stack2.peek());

    }
}
