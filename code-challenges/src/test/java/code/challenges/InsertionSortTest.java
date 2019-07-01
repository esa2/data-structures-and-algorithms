package code.challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void insertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = new int[]{2, 4, 5, 6, 8, 1, 3, 10, 9, 7};
        int[] returnArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals("Should return sorted array", insertionSort.insertionSort(arr), returnArr);
    }

    @Test
    public void insertionSortEdge() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = new int[]{99, 1};
        int[] returnArr = new int[]{1, 99};
        assertArrayEquals("Should return sorted array", insertionSort.insertionSort(arr), returnArr);
    }

    @Test
    public void insertionSortEdge2() {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = new int[]{1011};
        int[] returnArr = new int[]{1011};
        assertArrayEquals("Should return sorted array", insertionSort.insertionSort(arr), returnArr);
    }
}
