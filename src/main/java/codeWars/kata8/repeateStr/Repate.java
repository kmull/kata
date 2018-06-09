package codeWars.kata8.repeateStr;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Repate {

    public static void main(String[] args) {
        System.out.println(repeatStr(3, "ala"));
    }

    public static String repeatStr(final int repeat, final String string) {

        return repeat > 0 ? Stream.generate(() -> string)
                .limit(repeat)
                .collect(Collectors.joining())
                : "";
    }

}
