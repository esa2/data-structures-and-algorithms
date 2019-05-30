package code.challenges;

public class BinarySearch {

    public int BinarySearch(int[] sortedArr, int searchKey) {

        int lowIdx = 0;
        int highIdx = sortedArr.length - 1;

        while (highIdx >= lowIdx) {
            int middleIdx = (lowIdx + highIdx) / 2;

            if (sortedArr[middleIdx] == searchKey) return middleIdx;

            if (sortedArr[middleIdx] < searchKey) lowIdx = middleIdx + 1;

            if (sortedArr[middleIdx] > searchKey) highIdx = middleIdx - 1;
        }
        return -1;
    }
}
