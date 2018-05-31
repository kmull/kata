package codeWars.sumOfPositive;

import java.util.Arrays;

public class Positive {

    public static void main(String[] args) {


    }

    public static int sum(int[] arr) {

        return Arrays.stream(arr)
                .map(x -> x > 0 ? x : 0)
                .sum();
    }

    public static int sum2(int[] arr) {

        return Arrays.stream(arr)
                .filter(x -> x > 0)
                .sum();
    }

}
