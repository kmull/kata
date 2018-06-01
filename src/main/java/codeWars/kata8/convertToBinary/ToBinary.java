package codeWars.kata8.convertToBinary;

public class ToBinary {

    public static void main(String[] args) {
        toBinary(7);
    }

    public static int toBinary(int n) {

        return Integer.parseInt(Integer.toBinaryString(n));
    }

}
