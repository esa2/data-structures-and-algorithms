package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testQueueClassNode() {
        Queue newQueue =  new Queue();
        assertTrue("Should create empty queue", newQueue.front == null);
    }

    @Test
    public void testQueueClassEnqueue() {
        Queue newQueue =  new Queue();
       newQueue.enqueue(1);
        assertEquals("Should enqueue a new node on queue", newQueue.front.value, 1);
    }

    @Test
    public void testQueueClassDequeue() {
        Queue newQueue =  new Queue();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        assertEquals("Should dequeue node with value 1", newQueue.dequeue(), 1);
        assertEquals("Node with value 2 should now be front", newQueue.front.value, 2);
    }

    @Test
    public void testQueueClassPeek() {
        Queue newQueue =  new Queue();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        assertEquals("Node with value 1 should remain front", newQueue.peek(), 1);
    }
}
