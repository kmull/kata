package codeWars.kata8.substractSum;

import java.util.ArrayList;
import java.util.List;

public class SubstractSum {

    static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        addList();
        System.out.println(subtractSum(10));
    }

    public static String subtractSum(int n) {

        int tempN = n;
        int result = 0;
        while (tempN > 0) {
            result += tempN % 10;
            tempN /= 10;
        }
        return stringList.get(n - result -1);
    }

    public static void addList() {
        stringList.add("kiwi");
        stringList.add("pear");
        stringList.add("kiwi");
        stringList.add("banana");
        stringList.add("melon");
        stringList.add("banana");
        stringList.add("melon");
        stringList.add("pineapple");
        stringList.add("apple");

    }
}
