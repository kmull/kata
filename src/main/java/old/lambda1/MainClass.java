package old.lambda1;

import java.util.*;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

//        int[] tabInt = new int[10];
//        Random random = new Random();
////        System.out.println(random.nextInt(100));
//
//        for (int i = 0; i < tabInt.length; i++) {
//            tabInt[i] = random.nextInt(100);
//            System.out.println(tabInt[i]);
//        }

//        String myString = "alabama";
//        char[] charArray = myString.toCharArray();
////        List<String> myList = Arrays.asList(myString);
////        Set<String> mySet = new HashSet<>(Arrays.asList(myString));
//
//        Set<Character> characterSet = new HashSet(Arrays.asList(charArray));
//        String s1 = "";
//        for(Object tempChar : characterSet.toArray()){
//            s1 = String.valueOf(tempChar);
//        }
//        System.out.println(s1.length());

//        String myString = "alabama";
//        String[] stringsArray = myString.split("");
//        for (String f : stringsArray) {
//            System.out.println("list: " + f);
//        }
//        System.out.println();
//
//        Set<String> set = new HashSet<>();
//        Collections.addAll(set, stringsArray);
//        for (String f : set) {
//            System.out.println("set: " + f);
//        }
//
//        System.out.println("list length: " + stringsArray.length);
//        System.out.println("set length: " + set.toArray().length);

//        String abc = "alabama";
//        Set<Character> mySet = new HashSet();
//        for (Character tempChar : abc.toCharArray()) {
//            mySet.add(tempChar);
//        }
//        System.out.println(mySet.toArray().length);

        String alabama = "alabama";
        System.out.println(alabama.length());
        Set<Character> mySet = new HashSet();

        for (char tmpChar : alabama.toCharArray()) {
            mySet.add(tmpChar);
        }
        System.out.println(mySet.toArray().length);

        String[] stringArray = alabama.split("");
        List<String> stringList = Arrays.asList(stringArray);


    }
}
