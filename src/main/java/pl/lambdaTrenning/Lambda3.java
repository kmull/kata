package pl.lambdaTrenning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambda3 {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("d2", "a2", "b1", "b3", "c");

        myList.stream()
                .filter(s -> {
                    System.out.print("\nfilter: " + s);
                    return true;
                })
                .forEach(s -> s.toString());
        System.out.println();

//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return true;
//                });
        System.out.println();

        myList.stream()
                .sorted()
                .filter(s -> {
                    System.out.print("\nmy filter: " );
                    return true;
                })
                .forEach(System.out::print);

    }
}
