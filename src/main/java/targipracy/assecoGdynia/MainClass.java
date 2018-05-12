package targipracy.assecoGdynia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        String C = "example";
        String S = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
        String[] czesci = S.split("; ");
//        aaa.stream().map()

        List<String> wynik = Arrays.asList(czesci);
        wynik.stream()
                .map(x -> x + " <" + x.toLowerCase()
                        .replace(" ", "_")
                        .replace("-", "") +
                        "@" + C.toLowerCase() +
                        ".com>;")
                .forEach(x -> System.out.println(x));


    }
}
