package paczka.palindrom;

public class Palindrom {

    public static void main(String[] args) {

        String word = "ala";
        System.out.println("czy palindrom: " + checkIfPalindrom(word));
    }

    public static Boolean checkIfPalindrom(String word) {
        char[] checkWord = word.toCharArray();

        if (word == null || word == "") {
            return true;
        }
        if (word.length() < 2) {
            return true;
        } else {
            int start = 0;
            int end = word.length() - 1;

            for (int i = 0; i < end / 2; i++) {
                if (checkWord[start + i] != checkWord[end - i]) {
                    return false;
                }
            }
            return true;
        }
    }

}
