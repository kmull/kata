package old.lambda1;

public class PalindromString {

    public static void main(String[] args) {

        String text = "aaabbbcbaaa";
        System.out.println(checkIfPalindrom(text));
    }

    private static boolean checkIfPalindrom(String text) {
        char[] textArray = text.toCharArray();
        int start = 0;
        int end = textArray.length - 1;

        if (textArray.length < 2) {
            return true;
        } else {
            for (int i = 0; i <= end; i++) {
                if (textArray[start+i] != textArray[end-i]) {
                    return false;
                }

            }
        }
        return true;
    }

}
