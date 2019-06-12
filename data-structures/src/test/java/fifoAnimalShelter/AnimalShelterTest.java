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

    @Test
    public void testQueueClassEnqueueMultipleDogs() {
        Dog newDog1st = new Dog();
        newDog1st.name = "Fido";
        newDog1st.species = "dog";
        newAnimalShelter.enqueue(newDog1st);

        Dog newDog = new Dog();
        newDog.name = "Cooter";
        newDog.species = "dog";
        newAnimalShelter.enqueue(newDog);
        assertEquals("Should dequeue Fido first", newAnimalShelter.dequeue("dog"), newDog1st);
    }

    @Test
    public void testQueueClassEnqueueMultipleAnimals() {
        Dog newDog1st = new Dog();
        newDog1st.name = "Fido";
        newDog1st.species = "dog";
        newAnimalShelter.enqueue(newDog1st);

        Dog newDog = new Dog();
        newDog.name = "Cooter";
        newDog.species = "dog";
        newAnimalShelter.enqueue(newDog);

        Cat newCat1st = new Cat();
        newCat1st.name = "Scratchy";
        newCat1st.species = "cat";
        newAnimalShelter.enqueue(newCat1st);

        Cat newCat = new Cat();
        newCat.name = "Itchy";
        newCat.species = "cat";
        newAnimalShelter.enqueue(newCat);
        assertEquals("Should dequeue Scratchy first", newAnimalShelter.dequeue("cat"), newCat1st);
    }

    @Test
    public void testQueueClassPrefInvalid() {
        assertNull("Should return null in pref not dog or cat", newAnimalShelter.dequeue("horse"));
    }
}
