package pl.wzorce.builder3;

public class MainClass {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder(1, "Krzysztof")
                .setSurname("Muller")
                .setHeight(Height.TALL)
                .build();

        System.out.println(person.getId() + " " + person.getName() + " " +
                person.getSurname() + " " + person.getHeight());
    }
}
