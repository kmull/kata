package paczka.listyITablice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClassLists_1 {

    public static void main(String[] args) {
        int[] myArray = manyDigits(1, 4, 66, 99, 33, 2, 0, 7, 51, 9, 27);
        System.out.println();
        Arrays.stream(myArray)
                .map(x -> (x * 2) % 10)
                .filter(x -> x < 5)
                .skip(5)
                .forEach(a -> System.out.print(a + " "));

        Set<Integer> mySet_1 = Arrays.stream(myArray)
                .boxed()
                .collect(Collectors.toSet());

        Arrays.stream(myArray)
                .sorted()
                .distinct();
    }

    private static int[] manyDigits(int... digits) {
        int[] tempArray = new int[digits.length];
        int counter = 0;
        for (int a : digits) {
            System.out.print(a + " ");
            tempArray[counter++] = a % 10;
        }
        return tempArray;
    }
}
