package z.doTestu;

public class Dom {

    private String imie;
    private int age;
    int year;

    public Dom(String imie) {
        this.imie = imie;
    }

    public Dom(String imie, int age) {
        this.imie = imie;
        this.age = age;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
