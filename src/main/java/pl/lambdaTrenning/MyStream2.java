package pl.lambdaTrenning;

import java.util.Arrays;
import java.util.List;

public class MyStream2 {

    public static void main(String[] args) {

        List<String> myList1 = Arrays.asList("a1", "a2", "b3", "c2", "b1", "c1", "d1");

        myList1.stream()
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        myList1.stream()
                .sorted()
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        myList1.stream()
                .map(x -> x + ";")
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        myList1.stream()
                .spliterator().trySplit()
                .forEachRemaining(System.out::print);

    }
}
