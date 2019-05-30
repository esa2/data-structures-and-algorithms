package code.challenges;

import java.util.Arrays;

public class ArrayShift {

    public int[] insertShiftArray(int[] startArray, int addValue) {
        System.out.println("Starting array: " + Arrays.toString(startArray) + " Value to insert: " + addValue);
        int[] endArray = new int[startArray.length + 1];
        int middle = (startArray.length +1) / 2;
        int offset = 0;

        for (int i = 0; i < endArray.length; i++) {
            if (i == middle) {
                endArray[i] = addValue;
                offset = 1;
            } else {
                endArray[i] = startArray[i - offset];
            }
        }
        return endArray;
    }
}
