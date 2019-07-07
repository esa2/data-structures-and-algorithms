package hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HashtableTest {

    @Test
    public void testHashAdd() {
        Hashtable ht = new Hashtable();
        assertEquals("Should return added value", ht.add("Cat", "Josie"), "Josie");
    }

    @Test
    public void testHashGet() {
        Hashtable ht = new Hashtable();
        ht.add("Cat", "Josie");
        assertEquals("Should return value at key: Cat", ht.get("Cat"), "Josie");
    }
}
