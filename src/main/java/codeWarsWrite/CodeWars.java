package codeWarsWrite;

import java.util.Arrays;
import java.util.stream.Stream;

public class CodeWars {

    public static boolean isMerge(String s, String part1, String part2) {
        String part12 = part1.concat(part2);
        int counter = 0;


//        if (s.length() == (part1.concat(part2).length())) {
//            for(char tmpS : s.toCharArray())
//        }

        for (char tmp : s.toCharArray()) {
            for (char tmpPart : part12.toCharArray()) {
                if (tmpPart == tmp) {
                    counter++;
                    break;
                }
            }
        }
        if (counter == s.length() && (part12.length() == s.length())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isMerge("codewars", "code", "wars"));
        System.out.println(isMerge("codewar s'", "code '", "wars"));
        System.out.println(isMerge("abbcc'", "abc", "ab"));
        System.out.println(isMerge("abbcc'", "abc", "bc"));
    }
}
