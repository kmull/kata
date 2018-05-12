package a.tmp.cwiczenia;

public class StringPalindrom {

    public static void main(String[] args) {

        System.out.println(checkPalindrom("aaabaaa"));
    }

    private static boolean checkPalindrom(String text) {
        char[] arrayText = text.toCharArray();
        int start = 0;
        int end = arrayText.length - 1;

        if (text.length() < 2) {
            return true;
        } else {
            while (start < end) {
                if (arrayText[start++] != arrayText[end--]){
                    return false;
                }
            }
        }
        return true;
    }
}
