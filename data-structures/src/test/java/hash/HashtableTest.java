package hash;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testHashAdd() {
        Hashtable ht = new Hashtable();
        assertEquals("Should return added value", ht.add("Cat", "Josie"), "Josie");
    }

    @Test
    public void testHashAddCollision() {
        Hashtable ht = new Hashtable();
        ht.add("Cat", "Josie");
        assertEquals("Should add second key value pair at duplicate index", ht.add("Cat", "Scooter"), "Scooter");
    }

    @Test
    public void testHashGet() {
        Hashtable ht = new Hashtable();
        ht.add("Cat", "Josie");
        assertEquals("Should return value at key: Cat", ht.get("Cat"), "Josie");
    }

    @Test
    public void testHashGetNotFound() {
        Hashtable ht = new Hashtable();
        assertNull("Should return null if key not in table", ht.get("Rat"));
    }

    @Test
    public void testHashContainsTrue() {
        Hashtable ht = new Hashtable();
        ht.add("Cat", "Josie");
        assertEquals("Should return true", ht.contains("Cat"), true);
    }

    @Test
    public void testHashContainsFalse() {
        Hashtable ht = new Hashtable();
        ht.add("Cat", "Josie");
        assertEquals("Should return false", ht.contains("Dog"), false);
    }

    @Test
    public void testHashHash() {
        Hashtable ht = new Hashtable();
        assertEquals("Should return index integer", ht.hash("Dog"), 982);
    }
}
