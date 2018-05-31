package codeWars.convertToBinary;

import java.util.stream.IntStream;

public class ToBinary {

    public static void main(String[] args) {
        toBinary(7);
    }

    public static int toBinary(int n) {

        return Integer.parseInt(Integer.toBinaryString(n));
    }

}
