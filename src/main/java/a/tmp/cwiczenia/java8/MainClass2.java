package a.tmp.cwiczenia.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass2 {

    public static void main(String[] args) {
        String text = "ala ma kota i siedem kartek";

        String word = "abcd";
        String[] myArray = word.split("");
//        for(String d : myArray){
//            System.out.println(d);
//        }

        Set<String> myset = new HashSet<>();
        for (String tmp : myArray) {
            myset.add(tmp);
        }

        if (myArray.length == myset.size()) {
            System.out.println("tak".toUpperCase());
        } else {
            System.out.println("nie".toUpperCase());
        }


    }

}
