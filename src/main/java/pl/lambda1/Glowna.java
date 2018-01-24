package pl.lambda1;

public class Glowna {

    public static void main(String[] args) {

        DajWiadomosc moja1 = (message) ->
                System.out.println("Witaj " + message);

        DrugaWiadomosc moja2 = (message1, message2) ->
                System.out.println("Witaj " + message1
                + " twoj status " + message2);

        moja1.myMessage("Krzysztof");
        moja2.myMessage("Krzysztof", "student");

        ZwrocInt dodaj = (a, b) -> a + b;
        ZwrocInt odejmij = (a, b) -> a - b;
        ZwrocInt pomnoz = (a, b) -> a * b;
        ZwrocInt podziel = (a, b) -> (a / b) % 10;

        System.out.println("dodaj: " + oblicz(7, 8, dodaj));
        System.out.println("odejmij: " + oblicz(7,8, odejmij));
        int zmienna = oblicz(9, 12, pomnoz) - oblicz(134, 7, podziel);
        System.out.println("trudne wyliczenia: " + zmienna);

    }

    private static int oblicz(int a, int b, ZwrocInt zwrocInt){
        return zwrocInt.operation(a, b);
    }
}
