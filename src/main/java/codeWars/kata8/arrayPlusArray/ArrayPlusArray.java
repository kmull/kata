package codeWars.kata8.arrayPlusArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    public static String MakeUpperCase(String str) {
        return str.toUpperCase();
    }

    public static int howOld(final String herOld) {

        return Integer.parseInt(herOld.substring(0, 1));
    }

    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream()
                .sorted()
                .collect(Collectors.toList());

    }

}
