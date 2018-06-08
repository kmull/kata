package codeWars.kata8.removeFirstAndLastCharacter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println(remove("abcdef"));
    }

    public static String remove(String str) {

        return Stream.of(str)
                .map(x-> x.substring(1, x.length()-1))
                .collect(Collectors.joining());
    }

}
