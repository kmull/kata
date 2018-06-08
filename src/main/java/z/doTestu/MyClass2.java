package z.doTestu;

public class MyClass2 {

    public static void main(String[] args) {

        System.out.println("czy palindrom: " + intPalindrom(12321));
    }

    public static boolean intPalindrom(int word) {

        if (word < 10) {
            return true;
        }
        int result = 0;
        int tmpResult = word;

        while (tmpResult > 0) {
            int tmp = tmpResult % 10;
            tmpResult /= 10;
            result = result * 10 + tmp;
        }
        if (word - result != 0){
            return false;
        }
        return true;
    }

}
