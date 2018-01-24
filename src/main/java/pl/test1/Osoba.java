package pl.test1;

public class Osoba implements Interface1 {

    @Override
    public String funkcja1(Person person) {
        return person.getImie();
    }
}
