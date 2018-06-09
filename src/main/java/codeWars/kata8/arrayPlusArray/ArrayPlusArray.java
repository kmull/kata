package codeWars.kata8.arrayPlusArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayPlusArray {
    public static void main(String[] args) {

    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }
    public static int arrayPlusArray2(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}
