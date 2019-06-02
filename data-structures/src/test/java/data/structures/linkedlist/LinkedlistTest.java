package data.structures.linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedlistTest {

    @Test
    public void testNodeClass() {

        Node classUnderTest = new Node(99);
        assertEquals("Should create a new Node with a value of 1", classUnderTest.value, 99);
    }
}
