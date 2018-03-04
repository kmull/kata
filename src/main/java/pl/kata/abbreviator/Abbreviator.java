package pl.kata.abbreviator;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviator {

    private static String abbreviate(String string) {

        String[] strings = string.split(" ");
        String result = "";


        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < 4) {
                result += strings[i] + " ";
            } else {

                if (strings[i].contains(Pattern.quote("[^a-zA-Z]+"))) {
                    strings[i] = String.valueOf(strings[i].charAt(0)) +
                            (String.valueOf(strings[i]).length() - 3) +
                            String.valueOf(strings[i].charAt(strings[i].length() - 2)) +
                            String.valueOf(strings[i].charAt(strings[i].length() - 1));
                    result += strings[i] + " ";
                } else {
                    strings[i] = String.valueOf(strings[i].charAt(0)) +
                            (String.valueOf(strings[i]).length() - 2) +
                            String.valueOf(strings[i].charAt(strings[i].length() - 1));
                    result += strings[i] + " ";
                }
            }
        }
        return result.trim();
    }

    public static String abbreviate2(String source) {
        //System.out.println(source);
        String[] wordArr = Arrays.stream(source.split("(?=[^\\w]+)|(?<=[^\\w]+)"))
                .map(word -> {
                    //System.out.println(word);
                    if(word.chars().allMatch(Character::isLetter)) {
                        return abbreviateWord(word);
                    } else {
                        return word;
                    }
                }).toArray(size -> new String[size]);
        String result = String.join("",wordArr);
        return result;
    }
    private static String abbreviateWord(String word) {
        int wordLength = word.length();
        if(wordLength <=3) {return word;}
        int middleLength = wordLength - 2;
        String result = word.charAt(0) + String.valueOf(middleLength) + word.charAt(wordLength-1);
        return result;
    }

    public static void main(String[] args) {

//        System.out.println(abbreviate("krzysztof"));
//        System.out.println(abbreviate("krzysztof Muller"));
//        System.out.println(abbreviate("ma"));
//        System.out.println(abbreviate("mam"));
        System.out.println(abbreviate2("internationalization internationalizationX"));
        System.out.println(abbreviate2("You need, need not want, to complete this code-wars mission"));
        //                                   "You n2d, n2d not w2t, to c6e t2s c2e-w2s m5n"
        System.out.println(abbreviate("cat; mat: doggy'monolithic: a"));

    }
}

//"You n2d, n2d not w2t, to c6e t2s c2e-w2s m5n"