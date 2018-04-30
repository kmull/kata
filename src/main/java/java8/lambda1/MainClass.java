package java8.lambda1;

import java.util.Random;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        int[] tabInt = new int[10];
        Random random = new Random();
//        System.out.println(random.nextInt(100));

        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = random.nextInt(100);
            System.out.println(tabInt[i]);
        }

//        Stream.of(tabInt)
//                .filter()

    }
}
