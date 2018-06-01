package codeWars.kata8.countSheeps;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingSheep {

    public static void main(String[] args) {
        System.out.println(countingSheep(10));
    }

    public static String countingSheep(int num) {

//        String pattern = " sheep...";
//        String result="";
//        int count = 1;
//        do {
//            result += count + pattern;
//        }while (count++ < num);
//            return result;
        return IntStream.range(1, num + 1)
                .mapToObj(x -> " " + x + " sheep...")
                .collect(Collectors.joining());
    }

    public static String countingSheep2(int num) {
        return IntStream.range(1, num + 1)
                .mapToObj(n -> "" + n + " sheep...")
                .collect(Collectors.joining(""));
    }

}
