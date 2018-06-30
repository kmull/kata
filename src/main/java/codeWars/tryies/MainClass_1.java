package codeWars.tryies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass_1 {

    public static void main(String[] args) {
        System.out.println(reverse("Ala ma kota"));

    }

    public static String reverse(String str){
        List<String> stringList = Arrays.asList(str.split(" "));
        Collections.reverse(stringList);
        return String.join(" ", stringList);
    }

    public static String numberToString(int num) {

        return String.valueOf(num);
    }

}

/**
 *  width = 0,52 m
 *  length = 10 m
 *  15 % - more
 *
 * */