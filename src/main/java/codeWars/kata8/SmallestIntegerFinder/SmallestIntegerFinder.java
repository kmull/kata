package codeWars.kata8.SmallestIntegerFinder;

import java.util.Arrays;

public class SmallestIntegerFinder {

    public static void main(String[] args) {

    }

    public static int findSmallestInt(int[] args) {

        return Arrays.stream(args)
                .min()
                .getAsInt();
    }

}
