package codeWars.kata8.hexToDecimal;

public class HexToDec {

    public static void main(String[] args) {
        System.out.println(hexToDec("FF"));
    }

    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }

}
