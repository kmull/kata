package pl.kata.alt;

public class Alt {

    public static boolean isAlt(String alt) {

        String[] arr = alt.split("");

        for (String tmp : arr) {
            System.out.println(tmp);

            if(alt.contains("a") || alt.contains("o") || alt.contains("e") ||
                    alt.contains("i") || alt.contains("u")){
            }
        }



        return true;
    }

    public static void main(String[] args) {

        isAlt("amazon");

    }
}
