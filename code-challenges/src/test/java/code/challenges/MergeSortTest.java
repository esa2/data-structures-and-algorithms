package code.challenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{4, 2, 1, 3};
        int[] returnArr = new int[]{1, 2, 3, 4};
        assertArrayEquals("Should return sorted array", mergeSort.mergeSort(arr, 0, arr.length - 1), returnArr);
    }
    @Test
    public void mergeSortEdge() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{3, 1};
        int[] returnArr = new int[]{1, 3};
        assertArrayEquals("Should return sorted array", mergeSort.mergeSort(arr, 0, arr.length - 1), returnArr);
    }
}
