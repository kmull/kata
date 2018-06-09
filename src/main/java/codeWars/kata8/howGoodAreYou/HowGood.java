package codeWars.kata8.howGoodAreYou;

import java.util.Arrays;

public class HowGood {

    public static void main(String[] args) {

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

//        IntSummaryStatistics result = Stream.of(classPoints).
        return Arrays.stream(classPoints).average().getAsDouble() < yourPoints;
    }

}
