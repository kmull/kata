package pl.lambda3;

import java.io.*;
import java.util.*;

public class Glowna2 {
    String name;

    public Glowna2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) throws IOException {
//        int a = 0;
//
//        int b = a > 10 ? ++a : --a;
//        System.out.println(b);
//
//
//        int[] tab = {4, 2, 7, 1, 9, 3, 8};
//        tab[1] = 0;
//        for (int aa : tab) {
//            System.out.print(aa + " ");
//        }

//        Scanner scanner = new Scanner(System.in);

        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println("ala ma kota i azorka na podworku");
        zapis.close();

        File file = new File("ala.txt");
        Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        System.out.println(zdanie);

        int zlicz = 0;
        for (int i = 0; i < zdanie.length(); i++) {
            if (zdanie.charAt(i) == 'a') {
                zlicz++;
            }
        }
        System.out.println(zlicz);


//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
//            System.out.println(sc.next());
//            if(sc.next().equals('x')){
//                break;
//            }
//        }
        FileWriter fw = new FileWriter("file.txt", true);
        fw.write("nowa linia " + new Date() + "\n");
        fw.close();

        Map<Integer, String> gg = new HashMap();
        gg.put(1, "abc");
        Integer.parseInt("123");
    }
}
