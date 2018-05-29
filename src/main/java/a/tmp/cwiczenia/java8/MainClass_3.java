package a.tmp.cwiczenia.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass_3 {

    public static void main(String[] args) {

        List<Integer> intList = IntStream
                .range(1, 10)
                .boxed()
                .collect(Collectors.toList());

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );

        IntStream
                .range(1, 51)
                .filter(x -> x % 5 == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

//        Stream.of("Tom", "Andrzej", "Bartek", "Wojtek", "Milena", "karol", "grzes", "Kasia", "roman",
//                "Blarzej", "Dominika", "sylwia", "Teresa", "Zygmunt", "ola", "natalka", "Pati", "Bartosz", "Sylwia")
//                .map(x -> x.replace(x.substring(0,1), x.substring(0,1).toUpperCase()))
//                .forEach(x -> System.out.println(x));

//        Stream.of("Tom", "Andrzej", "Bartek", "Wojtek", "Milena", "karol", "grzes", "Kasia", "roman",
//                "Blarzej", "Dominika", "sylwia", "Teresa", "Zygmunt", "ola", "natalka", "Pati", "Bartosz", "Sylwia")
//                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1, x.length()))
//                .forEach(x -> System.out.println(x));

        Stream.of("Tom", "Andrzej", "Bartek", "Wojtek", "Milena", "karol", "grzes", "Kasia", "roman",
                "Blarzej", "Dominika", "sylwia", "Teresa", "Zygmunt", "ola", "natalka", "Pati", "Bartosz", "Sylwia")
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1, x.length()))
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);

        Stream.of("Tom", "Andrzej", "Bartek", "Wojtek", "Milena", "karol", "grzes", "Kasia", "roman",
                "Blarzej", "Dominika", "sylwia", "Teresa", "Zygmunt", "ola", "natalka", "Pati", "Bartosz", "Sylwia")
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1, x.length()))
                .sorted();
        System.out.println("\n");

        String[] names = {"Tom", "Andrzej", "Bartek", "Wojtek", "Milena", "Karol", "Grzes", "Kasia", "Roman",
                "Blarzej", "Dominika", "Sylwia", "Teresa", "Zygmunt", "Ola", "Natalka", "Pati", "Bartosz", "Sylwia"};

        Arrays.stream(names)
                .filter(x -> x.startsWith("B"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        List<String> people = Arrays.asList("Tom", "Andrzej", "Bartek", "Wojtek", "Milena", "Karol", "Grzes", "Kasia", "Roman",
                "Blarzej", "Dominika", "Sylwia", "Teresa", "Zygmunt", "Ola", "Natalka", "Pati", "Bartosz", "Sylwia",
                "Karolina");

        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("b"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        people.stream()
                .filter(x -> x.contains("z"))
                .forEach(System.out::println);
        System.out.println();

        people.stream()
                .filter(x -> x.length() > 6)
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        List<String> myList = people.stream()
                .filter(x -> x.length() > 5)
                .map(x -> x.toLowerCase())
                .collect(Collectors.toList());

        for (String tmp : myList) {
            System.out.println(tmp);
        }

//        Map<Integer, String> myMap = new HashMap<>();
//        myMap = people.stream()
//                .collect(Collectors.toMap(
//                        new Random(1000),
//                        ));
    }
}





















