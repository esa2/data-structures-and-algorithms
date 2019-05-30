package code.challenges;

import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    int[] startArr = new int[] {1,2,3,4,5,10};
    int[] endArr = reverseArray(startArr);
    System.out.println("Input array =   " + Arrays.toString(startArr) + "\n" + "Reverse array = " + Arrays.toString(endArr));
  }

  public static int[] reverseArray(int[] inputArray) {
    int[] reverseArr = new int[inputArray.length];
    for (int i = 0; i < inputArray.length; i++) reverseArr[i] = inputArray[inputArray.length -i -1];
    return reverseArr;
  }   
}
