package codeWars.kata8.altERnaTIng;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtils_2 {

    public static void main(String[] args) {

        System.out.println(toAlternativeString("HELLO world"));
    }

    public static String toAlternativeString(String string) {

        return Arrays.stream(string.split(""))
                .map(x -> x.matches("[A-Z]") ? x.toLowerCase() : x.toUpperCase())
                .collect(Collectors.joining());
    }
}
