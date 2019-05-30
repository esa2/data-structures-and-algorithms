package code.challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void insertShiftArray() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] returnedArray = new int[] {2, 4, 5 ,6, 8};
        assertArrayEquals("insertShiftArray should return array with 5 added in middle", classUnderTest.insertShiftArray(new int[] {2, 4, 6, 8}, 5), returnedArray);

        returnedArray = new int[] {4, 8, 15, 16, 23, 42};
        assertArrayEquals("insertShiftArray should return array with 16 added in the middle", classUnderTest.insertShiftArray(new int[] {4, 8, 15, 23, 42}, 16), returnedArray);

        returnedArray = new int[] {2};
        assertArrayEquals("insertShiftArray should return array with only 2 added when passing in empty array", classUnderTest.insertShiftArray(new int[] {}, 2), returnedArray);
    }
}
