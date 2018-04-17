package pl.myMatcher.policzLitere_A;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Glowna2 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("mojPlik.txt");
        Scanner sc = new Scanner(file);

        List<String> stringList = new ArrayList<>();

        while (sc.hasNextLine()) {
            stringList.add(sc.nextLine());
        }
        int count = 0;
        for (String tempString : stringList) {
            for (Character tempChar : tempString.toLowerCase().toCharArray()) {
                if (tempChar == 'a') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
