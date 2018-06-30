package codeWars.kata7.disarium;

import java.util.stream.IntStream;

import static java.lang.Math.pow;

public class Disarium {
    public static void main(String[] args) {
        System.out.println(disariumNumber2(123));
        System.out.println(disariumNumber2(89));
    }

    public static String disariumNumber(int number) {

        int tmp = number;
        int result = 0;
        int numLength = String.valueOf(number).length();

        for (int i = numLength; i > 0; i--) {
            result += (int) pow(tmp % 10, i);
            tmp /= 10;
        }
        return result == number ? "Disarium !!" : "Not !!";
    }

    public static String disariumNumber2(int number) {

        int[] numbersArray = Integer.toString(number)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

        return IntStream.range(0, numbersArray.length)
                .map(index -> (int) Math.pow(numbersArray[index], index + 1))
                .sum() == number ? "Disarium !!" : "Not !!";
    }

}
