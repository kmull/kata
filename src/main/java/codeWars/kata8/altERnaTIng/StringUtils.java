package codeWars.kata8.altERnaTIng;

import static java.lang.Character.*;

import java.util.*;
import java.util.stream.*;

/**
 * altERnaTIng cAsE <=> ALTerNAtiNG CaSe
 *toAlternativeString
 * */
public class StringUtils {

    public static void main(String[] args) {
        System.out.println(toAlternativeString("HELLO world"));
        System.out.println(toAlternativeString("hEllO wOrld"));
    }
    public static String toAlternativeString2(String string) {
        return string.chars()
                .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static String toAlternativeString3(String string) {
        return Arrays.stream(string.split(""))
                .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
                .collect(Collectors.joining(""));
    }

    public static String toAlternativeString(String string) {

        String[] myString = string.split("");
        String b = "";
        for (String stringTmp : myString) {
            b += stringTmp.equals(stringTmp.toUpperCase()) ? stringTmp.toLowerCase() : stringTmp.toUpperCase();
        }
        return b;
//
//        myString = (String[]) Arrays.stream(myString)
//                .map(x -> x.equals(x.toUpperCase()) ? x.toLowerCase() : x.toUpperCase())
//                .forEach(x->b);
//
//        for (String a : myString){
//            System.out.print(a);
//        }


    }

}

//        A - 65 : Z - 90
//        a - 97 : z -122