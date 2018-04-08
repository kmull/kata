package pl.lambdaTrenning;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {

    public static void main(String[] args) throws IOException {
/** 1. first one      */
        IntStream
                .range(1, 10)
                .skip(5)
//                .forEach(System.out::print); // (x -> System.out.println(x))
                .forEach(x -> System.out.println(x));
        System.out.println();

/** 2. sum range    */
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());

/** 4. sorted and filtered     */
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);
        System.out.println();

/** 5. Array sort, filter and print    */
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sam"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();

/** 6. average of squares of an int array   */
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::print);
        System.out.println();

        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .skip(2)
                .forEach(System.out::println);
        System.out.println();
/** 7. Stream from List, filter and print*/
        List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sam");
        people.stream()
                .map(s -> s.toLowerCase())
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
        System.out.println();

/** 8. Stream rows from text file, sort, filter, and print */
//        PrintWriter zapis = new PrintWriter("bands.txt");
//        Scanner sc = new Scanner(System.in);
//        String temp = "";
//        while (true) {
//            temp = sc.nextLine();
//            if(temp.equals("exit")){
//                break;
//            }
//            zapis.println(temp);
//        }
//        zapis.close();
        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 10)
                .forEach(System.out::println);
        System.out.println();

/** 9. rows from text file and save to List */
        List<String> bands2 = Files.lines(Paths.get("bands.txt"))
                .filter(x -> x.contains("an"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));

    }
}


















