package a.test.MainClass;

import java.util.Arrays;
import java.util.OptionalInt;

public class MainClass {

    public static void main(String[] args) {

        String S = "We test coders. Give us a try?";
//        S = "Forget  CVs..Save time . x x";


        newMethod(S);

    }

    private static int newMethod(String s) {
        return Arrays.stream(s.split("\\W+ \\S+"))
                .map(x -> x.split("\\W+").length)
                .mapToInt(Integer::intValue)
                .max().getAsInt();
        

//        return a.getAsInt();
    }
}
