package pl.rekrutacja.policzLitere_A;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Glowna {


    public static void main(String[] args) throws IOException {

        File file = new File("mojPlik.txt");
        Scanner sc = new Scanner(file);

        List<String> mylist = new ArrayList<>();
        while (sc.hasNextLine()) {
            mylist.add(sc.nextLine());
        }
        int count = 0;

        for (String tmpString : mylist) {
            for (Character tmpChar : tmpString.toLowerCase().toCharArray()) {
                if (tmpChar == 'a') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

//        PrintWriter zapis = new PrintWriter("mojPlik.txt");
//        Scanner sc = new Scanner(System.in);
//        String tmp = "";
//
//        while (true) {
//            tmp = sc.nextLine();
//            if (tmp.equals("exit")) {
//                break;
//            }
//            zapis.println(tmp);
//        }
//        zapis.close();