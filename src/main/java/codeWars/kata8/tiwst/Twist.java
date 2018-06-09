package codeWars.kata8.tiwst;

import java.util.Arrays;

public class Twist {

    public static void main(String[] args) {

    }

    public static String[] kataExampleTwist() {
        String[] websites = new String[1000];
        int count = 0;
        while (count++ != 1000) {
            websites[count - 1] = "codewars";
        }

//        Arrays.stream(websites)
//                .map(x-> "codewars")
//                .limit(1000);

        return websites;
    }
    public static String[] kataExampleTwist2() {
        String[] websites = new String[1000];
        Arrays.fill(websites, "codewars");
        return websites;
    }
}
