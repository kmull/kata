package codeWars.kata8.CodeWarsMath;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.*;

public class CodeWarsMath {

    public static void main(String[] args) {

        System.out.println(nearestSq3(1));
        System.out.println(nearestSq3(2));
        System.out.println(nearestSq3(10));
        System.out.println(nearestSq3(111));
    }

    public static int nearestSq(final int n) {

        int x = (int) sqrt(n);
//        System.out.println((x * x));
//        System.out.println((x + 1) * (x + 1));
        return abs(n - (x * x)) < abs(n - ((x + 1) * (x + 1))) ? x * x : (x + 1) * (x + 1);
    }

    public static int nearestSq2(final int n) {

        return IntStream.of((int) sqrt(n))
                .map(x -> (int) (abs(n - pow(x, 2)) < abs(n - pow((x + 1), 2)) ? pow(x, 2) : pow((x + 1), 2)))
                .sum();
    }

    public static int nearestSq3(final int n) {

        return IntStream.of((int) round(sqrt(n)))
                .map(x -> x * x)
                .sum();
    }
}
