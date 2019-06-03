package data.structures.linkedlist;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class LinkedlistTest {

    @Test
    public void testNodeClass() {
        Node node = new Node(99);
        assertEquals("Should create a new Node with a value of 99", node.value, 99);
    }

    @Test
    public void testLinkedlistClass() {
        Linkedlist list = new Linkedlist();
        assertTrue("Should create empty linked list", list.head == null);
    }

    @Test
    public void testLinkedlistInsert() {
        Linkedlist list = new Linkedlist();
        list.insert(11);
        assertEquals("Should create a head node with value 11", list.head.value, 11);
        list.insert(22);
        assertEquals("Should create a head node with value 22", list.head.value, 22);
        assertEquals("Make sure previous head node still there as next node", list.head.next.value, 11);
    }

    @Test
    public void testLinkedlistIncludeTrue() {
        Linkedlist list = new Linkedlist();
        list.insert(11);
        assertTrue("Should find a node value = 11", list.includes(11));
    }

    @Test
    public void testLinkedlistIncludeFalse() {
        Linkedlist list = new Linkedlist();
        list.insert(11);
        assertFalse("Should not find a node value = 33", list.includes(33));
    }

    @Test
    public void testLinkedlistPrint() {
        Linkedlist list = new Linkedlist();
        list.insert(11);
        list.insert(22);
        ArrayList<Integer> valuesArr = new ArrayList<>();
        valuesArr.add(22);
        valuesArr.add(11);
        assertEquals("Should return all values in linked list as an array list", list.print(), valuesArr);
    }
}
