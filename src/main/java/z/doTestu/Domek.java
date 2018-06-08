package z.doTestu;

public class Domek extends Dom {

    private int age;

    public Domek(String imie) {
        super(imie);
    }

    public Domek(String imie, int age) {
        super(imie);
        this.age = age;
    }

    @Override
    public String getImie() {
        return "to jest: " + super.getImie();
    }

    public static void main(String[] args) {

        Domek domek = new Domek("Kasia");
//        domek.setImie("kasia");
        domek.year = 111;

        System.out.println(domek.getImie());


    }
}
