package paczka.Fibonachi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wczytaj {

    public static void main(String[] args) throws IOException {
        giveTelefon();

        List<String> telefonList = getTelefon();
//
//        for(String tmp : telefonList){
//            System.out.println(tmp);
//        }
        int counter = 0;
        for (String tmpString : telefonList) {
            for (Character tmpChar : tmpString.toLowerCase().toCharArray()) {
                if (tmpChar.equals('a')) {
                    counter++;
                }
            }
        }
        System.out.println("ilosc liter 'a': " + counter);

    }

    private static List<String> getTelefon() throws FileNotFoundException {
        File file = new File("dane_telefonow.txt");
        Scanner sc = new Scanner(file);

        List<String> telefonList = new ArrayList<>();
        while (sc.hasNextLine()) {
            telefonList.add(sc.nextLine());
        }
        return telefonList;
    }

    private static void giveTelefon() throws IOException {
        Scanner sc = new Scanner(System.in);
        String imie = "";
        String telefon = "";

        while (true) {
            System.out.print("koniec - 'y', kontynuowanie - 'n'\nwybor: ");
            if (sc.nextLine().equals("y")) {
                break;
            }
            System.out.println();

            System.out.print("Podaj imie: ");
            imie = sc.nextLine();

            System.out.print("Podaj telefon: ");
            telefon = sc.nextLine();
            zapisDanych(imie, telefon);
            System.out.println();
        }
    }

    private static void zapisDanych(String imie, String telefon) throws IOException {
        Writer zapis = new BufferedWriter(new FileWriter("dane_telefonow.txt", true));
        zapis.append(imie);
        zapis.append(" : " + telefon + "\n");
        zapis.close();
    }
}
