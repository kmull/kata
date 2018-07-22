package codeFight.palindrom;

public class Palindrom {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abba"));
    }




    static boolean checkPalindrome3(String inputString) {
        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }

    static boolean checkPalindrome(String inputString) {
        return inputString
                .equals(new StringBuilder(inputString)
                        .reverse()
                        .toString());
    }

    static boolean checkPalindrome2(String inputString) {

        if (inputString.length() < 2) {
            return true;
        } else {
            int start = 0;
            int end = inputString.length() - 1;
            String[] tabInputString = inputString.split("");
            while (start < end) {
                if (!tabInputString[start].equals(tabInputString[end])) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
