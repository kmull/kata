package codeWars.kata8.reversedSequence;

import java.util.stream.IntStream;

public class ReversedSequence {

    public static void main(String[] args) {
        reverse(5);
    }

    public static int[] reverse(int n) {

        return IntStream.range(-n,0)
                .map(Math::abs)
                .toArray();

    }

}
