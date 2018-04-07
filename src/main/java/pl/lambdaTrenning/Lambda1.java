package pl.lambdaTrenning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambda1 {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1", "d4", "d1");

//        myList.forEach(s -> System.out.print(s + " "));
//        System.out.println();
//
//        myList.stream()
//                .filter(s -> s.startsWith("c"))
//                .map(s -> s.toUpperCase())
//                .sorted()
//                .forEach(s -> System.out.print(s + " "));
//        System.out.println();
//
//        myList.stream()
//                .filter(s -> s.startsWith("d"))
//                .map(String :: toUpperCase)
//                .sorted()
//                .forEach(System.out::println);

        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
        Stream.of("a1", "a2")
                .findAny()
                .ifPresent(System.out::println);
    }

}
