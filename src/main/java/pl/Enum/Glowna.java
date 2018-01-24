package pl.Enum;

public class Glowna {

    public enum Tydzien {
        PONIEDZIALEK,
        WTOREK,
        SRODA,
        CZWARTEK,
        PIATEK,
        SOBOTA,
        NIEDZIELA;
    }

    public static void printWriter(Tydzien t) {

        switch (t) {
            case PONIEDZIALEK:
                System.out.println("Poniedziałek");
                break;
            case WTOREK:
                System.out.println("wtorek");
                break;
//  asd
        }
    }

    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = new StringBuilder(a);
        System.out.println(a == b);
        System.out.println(a.equals(b));


        String c = "abc";
        StringBuilder z1 = new StringBuilder(c);
        System.out.println(z1.equals(c));
        System.out.println(c.equals(a));

    }
}
