package pl.lambdaTrenning;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTranning_1 {

    public static void main(String[] args) {

        List<Integer> intList = IntStream
                .range(1, 10)
                .mapToObj(i -> i)   // boxed()
                .collect(Collectors.toList());

        intList.stream()
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        List<Integer> integerList = IntStream
                .range(1, 10)
                .skip(5)
                .boxed()
                .collect(Collectors.toList());

        integerList.stream()
                .forEach(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println(IntStream
                .range(1, 100)
                .skip(75)
                .sum());
        System.out.println();

        System.out.println(IntStream
                .range(1, 5)
                .max()
                .getAsInt()
        );
        System.out.println();
/**    ##############################################   */
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);

    }
}
