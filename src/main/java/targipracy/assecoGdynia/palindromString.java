package targipracy.assecoGdynia;

public class palindromString {

    public boolean isPalindrom(String word) {

        if (word.length() < 2) {
            return true;
        } else {
            int start = 0;
            int end = word.length() - 1;
            char[] result = word.toCharArray();

            while (start != end) {
                if (result[start++] != result[end--]) {
                    return false;
                }
            }
        }
        return true;
    }
}
