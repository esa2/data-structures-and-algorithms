package fifoAnimalShelter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {

    private AnimalShelter newAnimalShelter;
    @Before
    public void setup() {
        newAnimalShelter =  new AnimalShelter();
    }

    @Test
    public void testQueueClassNode() {

        assertNull("Should create empty queue", newAnimalShelter.front);
    }

    @Test
    public void testQueueClassEnqueue() {
        newAnimalShelter.enqueue(1);
        assertEquals("Should enqueue a new node on queue", newAnimalShelter.front.data, 1);
    }
}
