package fifoAnimalShelter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class AnimalShelterTest {

    private AnimalShelter newAnimalShelter;
    @Before
    public void setup() {
        newAnimalShelter =  new AnimalShelter();
    }

    @Test
    public void testQueueClassNode() {

        assertNull("Should create empty queue", newAnimalShelter.dogFront);
    }

    @Test
    public void testQueueClassEnqueueDog() {
        Dog newDog = new Dog();
        newDog.name = "Fido";
        newDog.species = "dog";
        newAnimalShelter.enqueue(newDog);
        assertEquals("Should enqueue and dequeue a dog", newAnimalShelter.dequeue("dog"), newDog);
    }

    @Test
    public void testQueueClassEnqueueCat() {
        Cat newCat = new Cat();
        newCat.name = "Itchy";
        newCat.species = "cat";
        newAnimalShelter.enqueue(newCat);
        assertEquals("Should enqueue and dequeue a cat", newAnimalShelter.dequeue("cat"), newCat);
    }
}
