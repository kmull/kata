package old.stream1;

import java.util.stream.Stream;

public class MyStream1 {

    public static void main(String[] args) {

//        IntStream
//                .range(1, 10)
//                .forEach(System.out::print);

//        IntStream
//                .range(1, 10)
//                .skip(5)
//                .forEach(x -> System.out.println(x));

//        System.out.println(
//                IntStream
//                .range(1, 5)
//                .sum()
//        );

//        Stream.of("Ania","Karol", "Dawid", "Blazej")
//                .sorted()
//                .findFirst()
//                .ifPresent(System.out::println);

//        Stream.of("Ania","Karol", "Dawid", "Blazej", "Kazik")
//                .filter(x -> x.startsWith("K"))
//                .sorted()
//                .forEach(System.out::println);

        Stream.of("Ania","Karol", "Dawid", "Blazej", "Kazik")
                .filter(x -> x.contains("z"))
                .sorted()
                .forEach(System.out::println);
    }
}



























