package pl.rekrutacja.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Glowna {

    public static void main(String[] args) {

        String text_1 = "--- - - Aaa -- adada ---";

        String myPattern = "";
        Pattern pattern = Pattern.compile(myPattern);

        Matcher matcher = pattern.matcher(text_1);

        while (matcher.find()) {
            System.out.println(matcher.group(1) + " " +
                    matcher.group(2) + " " +
                    matcher.group(3));
        }

    }

}
