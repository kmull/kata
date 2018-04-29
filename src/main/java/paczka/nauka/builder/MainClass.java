package paczka.nauka.builder;

public class MainClass {

    public static void main(String[] args) {
        Person person_Adam = new Person.PersonBuilder("Adam", "Kowalski", Gender.MALE)
                .setAge(30)
                .setPesel("1234567890")
                .build();

        personView(person_Adam);

        Person person_Basia = new Person.PersonBuilder("Basia", "Nowak", Gender.FEMALE)
                .setAge(23)
                .setPesel("2223334442")
                .build();
        personView(person_Basia);
    }

    private static void personView(Person person_Adam) {
        System.out.println(person_Adam.getName() + "\n" +
                person_Adam.getSurname() + "\n" +
                person_Adam.getAge() + "\n" +
                person_Adam.getGender() + "\n" +
                person_Adam.getPesel() + "\n");
    }

}