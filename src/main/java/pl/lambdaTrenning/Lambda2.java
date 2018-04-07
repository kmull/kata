package pl.lambdaTrenning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda2 {

    public static void main(String[] args) {

        Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);

        Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .map(n -> 2 * n)
                .forEach(System.out::print);
        System.out.println();

        List<String> stringList = Arrays.asList("a1", "a2", "a3", "a4");
        stringList.stream()
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

//        List<Integer> myList = Arrays.asList(1, 2, 3, 4);
//        myList.stream()
//                .mapTo
        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

    }

}
