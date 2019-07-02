package code.challenges;
// source: https://www.geeksforgeeks.org/merge-sort/

public class MergeSort {

    int[] sortedArray;
    public int[] mergeSort(int arr[], int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            sortedArray = merge(arr, left, mid, right);
        }
        return sortedArray;
    }

    public int[] merge(int arr[], int left, int mid, int right) {
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;
        int tempLeft[] = new int[sizeLeft];
        int tempRight[] = new int[sizeRight];

        for (int i = 0; i < sizeLeft; ++i) tempLeft[i] = arr[left + i];
        for (int j = 0; j < sizeRight; ++j) tempRight[j] = arr[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = left;
        while (i < sizeLeft && j < sizeRight) {
            if (tempLeft[i] <= tempRight[j]) {
                arr[k] = tempLeft[i];
                i++;
            } else {
                arr[k] = tempRight[j];
                j++;
            }
            k++;
        }

        while (i < sizeLeft) {
            arr[k] = tempLeft[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            arr[k] = tempRight[j];
            j++;
            k++;
        }
        return arr;
    }
}

//public class MergeSort {
//
//    public void mergeSort(int[] arr) {
//        int n = arr.length;
//
//        if (arr.length > 1) {
//            int mid = n / 2;
//            // left array
//            int[] b = new int[mid];
//            for (int i = 0; i < b.length; i++) b[i] = arr[i];
//            // right array
//            int[] c = new int[mid];
//            for (int j = 0; j < c.length; j++) c[j] = arr[j + mid];
//            mergeSort(b);
//            mergeSort(c);
//            merge(b, c, arr);
//        }
//    }
//
//    public int[] merge(int[] b, int[] c, int[] a) {
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < b.length && j < c.length) {
//
//            if (b[i] <= c[j]) {
//                a[k] = b[i];
//                i = i + 1;
//            } else {
//                a[k] = c[j];
//                j = j + 1;
//                k = k + 1;
//            }
//        }
//
//        if (i == b.length) {
//            while (j < c.length) {
//                k = k + 1;
//                j = j + 1;
//                a[k] = c[j];
//            }
//        } else {
//            while (i < b.length) {
//                k = k + 1;
//                i = i + 1;
//                a[k] = b[i];
//            }
//        }
//        return a;
//    }
//}
