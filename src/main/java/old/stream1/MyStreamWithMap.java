package old.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamWithMap {

    public static void main(String[] args) {

        List<String> people = Arrays.asList("Ala", "Alo", "Ania", "Armin", "Tomek", "Wojciech", "Daria", "Wiola", "Michal");
//
//        people
//                .stream()
////                .map(x -> x.toLowerCase())
//                .map(String::toLowerCase)
//                .filter(x -> x.startsWith("a"))
//                .forEach(System.out::println);

//        people.stream()
//                .sorted()
//                .filter(x -> x.length() < 6)
//                .forEach(System.out::println);

        List<String> myPeople = people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.contains("a"))
                .collect(Collectors.toList());
        myPeople.forEach(x -> System.out.println(x));
    }
}
