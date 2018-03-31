package pl.kata.reverseDigits;

public class DigitizeExampleTests {

    public static int[] digitize(long n) {

        String stringValue = String.valueOf(n);
        int[] intResult = new int[stringValue.length()];
        for (int i = stringValue.length() - 1; i >= 0; i--) {
            intResult[stringValue.length() - 1 - i] = Integer.parseInt(String.valueOf(stringValue.charAt(i)));
        }
        return intResult;
    }

    public static int[] digitize2(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static void main(String[] args) {
        for (int a : digitize(123456)) {
            System.out.print(a);
        }
        System.out.println();

        for (int a : digitize2(123456)) {
            System.out.print(a);
        }
    }

}
