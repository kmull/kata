package pl.lambdaTrenning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Lambda4 {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a", "b", "c", "a", "a");
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);

        Set<String> result = myList.stream()
                .collect(toSet());
        for(String a : result){
            System.out.println(a);
        }

//        Map<Integer, String> result2 = myList.stream()
//                .collect(Collectors.toMap(ints, String::length, (i1, i2) -> i1);

    }

}


//        Arrays.stream(new int[]{1, 2, 3, 4, 5})
//                .map(n -> 2 * n + 1)
//                .average()
//                .ifPresent(System.out::println);
//
//                Arrays.stream(new int[]{1, 2, 3, 4, 5})
//                .map(n -> 2 * n)
//                .forEach(System.out::print);
//                System.out.println();
//
//                List<String> stringList = Arrays.asList("a1", "a2", "a3", "a4");
//        stringList.stream()
//        .map(s -> s.substring(1))
//        .mapToInt(Integer::parseInt)
//        .max()
//        .ifPresent(System.out::println);
//
////        List<Integer> myList = Arrays.asList(1, 2, 3, 4);
////        myList.stream()
////                .mapTo
//        IntStream.range(1, 4)
//        .mapToObj(i -> "a" + i)
//        .forEach(System.out::println);