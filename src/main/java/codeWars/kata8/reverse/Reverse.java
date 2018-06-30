package codeWars.kata8.reverse;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseWords2("I like eating"));
    }

    public static String reverseWords(String str) {
//        String[] aaa = str.split(" ");
//        return String.valueOf(Stream.of(str.split(" ") + " ")
//                .collect(Collectors.toCollection(ArrayDeque::new))
//                .descendingIterator());

//        return Arrays.stream(str.split(" "))
//                .collect(Collectors.toCollection(ArrayDeque::new))
//                .descendingIterator();

        String[] aaa = str.split(" ");
        String result = "";

        for (int i = 0; i < aaa.length; i++) {
            result += aaa[aaa.length - i - 1] + " ";
        }
        return result.trim();
    }

    public static String reverseWords2(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
