package pl.rekrutacja.palindrom;

public class IntPalindrom {

    public static boolean isPalindrom(Integer number) {

        if (number == null) {
            return false;
        }

        Integer temp = number;
        Integer result = 0;

        while (temp != 0) {
            int remain = temp % 10;
            result = result * 10 + remain;
            temp /= 10;
        }

        if (number - result == 0) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(123454321));
        System.out.println(isPalindrom(1234543218));
    }

}
