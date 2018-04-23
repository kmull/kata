package pl.kata.phones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneDir {

    public static void phone(String string, String num) {

        String searchedString = findNumber(string, num);
        if (!searchedString.equals("Error => Too many people: nb")) {
            List<String> word = splitString(searchedString);
            viewWord(word, num);
        }else {
            System.out.println("Error => Too many people: " + num);
        }

    }

    private static String findNumber(String string, String num) {
        List<String> stringList = Arrays.asList(string.split("\n"));
        String result = "null";
        int count = 0;
        for (String tmpString : stringList) {
            if (tmpString.contains(num)) {
                result = tmpString;
                count++;
            }
            if (count > 1) {
                result = "Error => Too many people: nb";
            }
        }
        return result;
    }

    private static void viewWord(List<String> word, String num) {
        for (String a : word) {
            if (a.equals("Phone => Error => Not found: nb")) {
                System.out.println("# " + a.replace("nb", num));
                break;
            } else if (a.equals("Error => Too many people: nb")) {
                System.out.println("# " + a.replace("nb", num));
            }
            else {
                System.out.println("# " + a);
            }
        }
    }

    private static List<String> splitString(String searchedString) {
        List<String> word = new ArrayList<>();

        String myPattern = "(\\+)[0-9-]+";
        word.add("Phone => " + findMatcher(searchedString, myPattern));

        myPattern = "(<)([a-zA-Z' ]+)(>)";
        word.add("Name => " + findMatcher(searchedString, myPattern));

        searchedString = searchedString
                .replaceAll("(<)([a-zA-Z' ]+)(>)", "")
                .replaceAll("(\\+)[0-9-]+", "");

        word.add("Address => " + searchedString.trim()
              //  .replaceAll("[^a-z^A-Z ^. ^]", " ")
                .replaceAll("[\\s-]+", " ")
//                .replace("\\/", "")
                .trim());
        return word;
    }

    private static String findMatcher(String searchedString, String myPattern) {
        Pattern pattern = Pattern.compile(myPattern);
        Matcher matcher = pattern.matcher(searchedString);

        if (matcher.find()) {
            return matcher.group(0).replace("<", "").replace(">", "").trim();
        }
        return "Error => Not found: nb";
    }

    public static void main(String[] args) {

        String dr = "/+1-541-754-3010 156 Alphand_St. <J Steeve>\n 133, Green, Rd. <E Kustur> NY-56423 ;+1-541-914-3010\n"
                + "+1-541-984-3012 <P Reed> /PO Box 530; Pollocksville, NC-28573\n :+1-321-512-2222 <Paul Dive> Sequoia Alley PQ-67209\n"
                + "+1-741-984-3090 <Peter Reedgrave> _Chicago\n :+1-921-333-2222 <Anna Stevens> Haramburu_Street AA-67209\n"
                + "+1-111-544-8973 <Peter Pan> LA\n +1-921-512-2222 <Wilfrid Stevens> Wild Street AA-67209\n"
                + "<Peter Gone> LA ?+1-121-544-8974 \n <R Steell> Quora Street AB-47209 +1-481-512-2222\n"
                + "<Arthur Clarke> San Antonio $+1-121-504-8974 TT-45120\n <Ray Chandler> Teliman Pk. !+1-681-512-2222! AB-47209,\n"
                + "<Sophia Loren> +1-421-674-8974 Bern TP-46017\n <Peter O'Brien> High Street +1-908-512-2222; CC-47209\n"
                + "<Anastasia> +48-421-674-8974 Via Quirinal Roma\n <P Salinger> Main Street, +1-098-512-2222, Denver\n"
                + "<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n <Bernard Deltheil> +1-498-512-2222; Mount Av.  Eldorado\n"
                + "+1-099-500-8000 <Peter Crush> Labrador Bd.\n +1-931-512-4855 <William Saurin> Bison Street CQ-23071\n"
                + "<P Salinge> Main Street, +1-098-512-2222, Denve\n" + "<P Salinge> Main Street, +1-098-512-2222, Denve\n";

        phone(dr, "48-421-674-8974");
        System.out.println();
        phone(dr, "1-541-754-3010 156");
        System.out.println();
        phone(dr, "1-111-544-8973");
        System.out.println();
        /*************************************/

        phone(dr, "48-421-674-8974");
        System.out.println();
        phone(dr, "1-921-512-2222");
        System.out.println();
        phone(dr, "1-908-512-2222");
        System.out.println();
        phone(dr, "1-541-754-3010");
        System.out.println();
        phone(dr, "1-121-504-8974");
        System.out.println();
        phone(dr, "1-498-512-2222");
        System.out.println();
        phone(dr, "1-098-512-2222");
        System.out.println();
        phone(dr, "5-555-555-5555");


//        System.out.println(dr);
    }

}
