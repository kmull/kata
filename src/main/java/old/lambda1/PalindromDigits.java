package old.lambda1;

public class PalindromDigits {

    public static void main(String[] args) {

        System.out.println(checIfPalindrom(1234321));
    }

    private static boolean checIfPalindrom(int intValue) {
        int changingValue = intValue;
        int result = 0;

        if (changingValue < 2) {
            return true;
        } else {
            while (changingValue > 0) {
                result = (result * 10) + (changingValue % 10);
                changingValue /= 10;
            }
        }
//        System.out.println(intValue == result);
        return intValue == result;
    }

}
