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

    @Test
    public void testLinkedlistAppend() {
        Linkedlist list = new Linkedlist();
        list.insert(11);
        list.insert(22);
        list.append(33);
        assertEquals("Last node in list should have value 33", list.head.next.next.value, 33);
    }

    @Test
    public void testLinkedlistAppendMultiple() {
        Linkedlist list = new Linkedlist();
        list.insert(11);
        list.append(22);
        list.append(33);
        assertEquals("Next to last node in list should have value 22", list.head.next.value, 22);
        assertEquals("Last node in list should have value 33", list.head.next.next.value, 33);
    }

    @Test
    public void testLinkedlistInsertBefore() {
        Linkedlist list = new Linkedlist();
        list.insert(11);
        list.insert(22);
        list.insertBefore(11, 33);
        assertEquals("2nd node in list should have value 33", list.head.next.value, 33);
    }

    @Test
    public void testLinkedlistInsertBeforeFirst() {
        Linkedlist list = new Linkedlist();
        list.insert(11);
        list.insertBefore(11, 22);
        assertEquals("Head node in list should have value 22", list.head.value, 22);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinkedlistInsertExceptionEmptyList() {
        Linkedlist list = new Linkedlist();
        list.insertBefore(88, 33);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinkedlistInsertExceptionValNotFound() {
        Linkedlist list = new Linkedlist();
        list.insert(11);
        list.insert(12);
        list.insertBefore(44, 33);
    }
}
