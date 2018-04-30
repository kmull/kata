package java8.youtube.stream1;

import java.util.Arrays;
import java.util.List;

public class MyStreamWithMap {

    public static void main(String[] args) {

        List<String> people = Arrays.asList("Ala", "Ania", "Armin", "Tomek", "Wojciech", "Daria", "Wiola", "Michal");

        people
                .stream()
//                .map(x -> x.toLowerCase())
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
    }
}
