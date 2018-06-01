package codeWars.kata8.stringyStrings;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringyStrings {

    public static void main(String[] args) {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            System.out.println(size + " " + stringy2(size));
        }
    }

    public static String stringy(int size) {

        int a = size / 2;
        String result = "";

        for (int i = 0; i < a; i++) {
            result += "10";
        }
        if (size % 2 == 1) {
            result += 1;
        }
        return result;
    }

    public static String stringy2(int size) {

        return IntStream.rangeClosed(1, size)
                .map(x -> x % 2)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));
    }
}
