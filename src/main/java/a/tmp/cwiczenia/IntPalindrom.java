package a.tmp.cwiczenia;

public class IntPalindrom {

    public static void main(String[] args) {

        System.out.println(checkIfPalindrom(0));
    }

    private static boolean checkIfPalindrom(int text) {
        int newText = text;
        int result = 0;

        if (text < 10) {
            return true;
        } else {
            while (newText > 0) {
                result = result * 10 + newText % 10;
                newText /= 10;
            }
            if (text - result != 0) {
                return false;
            }
        }
        return true;
    }
}
