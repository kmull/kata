package pl.rekrutacja.palindrom;

public class StringPalindrom {

    public boolean isPalindrom(String s) {

        if (s == null || s == "") {
            return false;
        }
        if (s.length() < 2) {
            return true;
        }
        return checkArrayIsPalindrom(s);
    }

    private boolean checkArrayIsPalindrom(String s) {

        char[] tab = s.toCharArray();
        int first = 0;
        int last = tab.length - 1;

        while (last > first) {
            if (tab[first++] != tab[last--]) {
                return false;
            }
        }

        return true;
    }

//    public static void main(String[] args) {
//
//        System.out.println(isPalindrom("abbac"));
//
//    }
}
