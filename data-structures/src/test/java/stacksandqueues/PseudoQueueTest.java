package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void testQueueFront() {
        PseudoQueue newPseudoQueue = new PseudoQueue();

        newPseudoQueue.stack1.push(20);
        newPseudoQueue.stack1.push(15);
        newPseudoQueue.stack1.push(20);
        newPseudoQueue.enqueue(5);
        assertEquals("Front of queue should have value 20", newPseudoQueue.queue.peek(), 20);
    }

    @Test
    public void testQueueBack() {
        PseudoQueue newPseudoQueue = new PseudoQueue();

        newPseudoQueue.stack1.push(20);
        newPseudoQueue.stack1.push(15);
        newPseudoQueue.stack1.push(20);
        newPseudoQueue.enqueue(5);
        assertEquals("Back of queue should have value 5", newPseudoQueue.queue.top.next.next.next.value, 5);
    }

    @Test
    public void testQueueDequeue() {
        PseudoQueue newPseudoQueue = new PseudoQueue();

        newPseudoQueue.stack1.push(20);
        newPseudoQueue.stack1.push(15);
        newPseudoQueue.stack1.push(20);
        newPseudoQueue.enqueue(5);
        newPseudoQueue.dequeue();
        assertEquals("Remove front of queue, new front should be 15", newPseudoQueue.queue.top.value, 15);
    }
}
