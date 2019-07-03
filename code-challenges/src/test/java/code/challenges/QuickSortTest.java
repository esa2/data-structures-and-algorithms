package code.challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void mergeSortSmall() {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{3, 2, 1};
        int[] returnArr = new int[]{1, 2, 3};

        assertArrayEquals("Should return sorted array", quickSort.quickSort(arr, 0, 2), returnArr);
    }

    @Test
    public void mergeSort() {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{9, 2, 3, 8, 1, 4, 6, 5, 7};
        int[] returnArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertArrayEquals("Should return sorted array", quickSort.quickSort(arr, 0, 8), returnArr);
    }

    @Test
    public void mergeSortEdge() {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{1};
        int[] returnArr = new int[]{1};

        assertArrayEquals("Should return sorted array", quickSort.quickSort(arr, 0, 0), returnArr);
    }
}
