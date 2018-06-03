package codeWars.kata8.Pin;

import java.util.stream.Stream;

public class Pin {
    public static void main(String[] args) {
        System.out.println(validatePin2("a234"));
        System.out.println(validatePin2(".234"));
    }

    public static boolean validatePin(String pin) {

        if (pin.length() == 4 || pin.length() == 6) {
            try {
                Integer.parseInt(pin);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public static boolean validatePin2(String pin) {
        Integer a = 0;
        a = Stream.of(pin)
                .filter(x -> x.length() == 4 || x.length() == 6)
                .filter(x -> x.contains("[0-9]"))
                .mapToInt(s -> Integer.parseInt(s))
                .sum();

        return a == 0 ? false : true;
    }
    public static boolean validatePin3(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

}

//    assertEquals(false, Solution.validatePin("a234"));
//        assertEquals(false, Solution.validatePin(".234"));

//        Stream.of(pin)
//                .filter(x -> x.length() == 4 || x.length() == 6)
//                .map(x -> x.toCharArray())
//                .map(x-> )