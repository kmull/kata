package old.lambda1;

public class DotCounter {

    public static void main(String[] args) {

        String word = "A..l.a ..ma. .kota ..i.. .psa.";
        countDots(word);
    }

    private static void countDots(String word) {
        String result = word.replace(".", "");
        System.out.println(word.length() - result.length());
    }
}
