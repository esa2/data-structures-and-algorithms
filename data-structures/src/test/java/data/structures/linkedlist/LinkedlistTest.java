package data.structures.linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedlistTest {

    @Test
    public void testNodeClass() {
        Node node = new Node(99);
        assertEquals("Should create a new Node with a value of 1", node.value, 99);
    }

    @Test
    public void testLinkedlistClass() {
        Linkedlist list = new Linkedlist();
        assertTrue("Should create empty linked list", list.head == null);

        list.insert(11);
        assertEquals("Should create a head node with value 11", list.head.value, 11);
        list.insert(22);
        assertEquals("Should create a new head node with a value of 22", list.head.value, 22);
        assertEquals("Make sure previous head node still there as next node", list.head.next.value, 11);
    }
}
