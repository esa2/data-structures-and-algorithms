package code.challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void BinarySearchFound() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue("BinarySearch should return index if key found", classUnderTest.BinarySearch(new int[]{4, 8, 15, 16, 23}, 16) == 3);
    }

    @Test
    public void BinarySearchNotFound() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue("BinarySearch should return -1 if key not found", classUnderTest.BinarySearch(new int[]{4, 8, 15, 16, 23}, 17) == -1);
    }
}
