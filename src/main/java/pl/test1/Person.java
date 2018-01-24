package pl.test1;

public class Person {
    private String imie;
    private  String nazwisko;
    private int age;

    public Person(String imie, String nazwisko, int age) {
        super();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.age = age;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
