package pl.lambda2;

import java.util.Scanner;

public class Glowna {

    public static void main(String[] args) {

        Interfejs1 dodaj = (a, b) -> String.valueOf(a + b);
        Interfejs1 odejmij = (a, b) -> String.valueOf(a - b);

        System.out.println(funkcja1(7, 8, dodaj));

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        Interfejs2 zamien = (i, j) -> Integer.valueOf(i + j);

        System.out.println(funkcja2(a, b, zamien));
    }

    private static String funkcja1 (int a, int b, Interfejs1 interfejs1) {
        return interfejs1.zamien(a, b);
    }

    private static Integer funkcja2 (String a, String b, Interfejs2 interfejs2) {
        return interfejs2.zamien(a, b);
    }
}
