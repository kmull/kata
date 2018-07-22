package java8.stream.stream1;

import java.util.Arrays;
import java.util.List;

public class MainClass {


    public static void main(String[] args) {

        List<String> myList = Arrays
                .asList("a1", "a2", "a3", "b1", "c2", "c1", "d7", "d8", "d2", "d4");

        myList
                .stream()
                .filter(s -> s.startsWith("d"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
