package pl.lambdaTrenning;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {

    public static void main(String[] args) {
/** 1. first one      */
        IntStream
                .range(1, 10)
                .skip(5)
//                .forEach(System.out::print); // (x -> System.out.println(x))
                .forEach(x -> System.out.println(x));
        System.out.println();

/** 2. sum range    */
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
/** 4. sorted and filtered     */
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);
/** 5. Array sort, filter and print    */

    }
}
