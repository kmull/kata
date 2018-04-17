package pl.myMatcher.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Glowna {

    public static String match(String text, String myPattern) {

        Pattern pattern = Pattern.compile(myPattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group(0);
        } else {
            return "No match";
        }
    }

    public static void main(String[] args) {

        String checkText = "--- - - Aaa -- adada ---";
        String myPattern = "(\\w+)(\\W+)(\\w+)";
        System.out.println(match(checkText, myPattern));

        checkText = "--- - - Aaa -6- adada ---";
        myPattern = "(\\w+)(\\W+)(\\d+)(\\W+)(\\w+)";
        System.out.println(match(checkText, myPattern));

        checkText = "--- - - Aaa -55- adada ---";
        System.out.println(match(checkText, myPattern));

        checkText = "AAA aaa03030aaa AAA";
        myPattern = "([a-z]+[0-9]+[a-z]+)";
        System.out.println(match(checkText, myPattern));

        checkText = "AAA aaa03030aaa AAA";
        myPattern = "";
        System.out.println(match(checkText, myPattern));

    }
}
/**
 *  \w OR [a-zA-Z_0-9] - word characters
 *  \W OR [^\w]
 *
 * */

//  "--- - - Aaa -- adada ---";
//  "Aaa -- adada"