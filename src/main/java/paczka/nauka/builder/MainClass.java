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

        Car car = new Car.CarBuilder("Opel", "Vectra", 2004)
                .setFuel(FuelEnum.DIESEL)
                .build();
        viewCar(car);

        Pet pet = new Pet.PetBuilder("Pikuś", "Karol")
                .setColor("brązowy")
                .setAge(8)
                .setSmallOrBig(true)
                .build();
        System.out.println(pet.getName() + " " + pet.getAge());
        System.out.println();

        Cat cat = new Cat.CatBuilder("Mruczek")
                .setColor(ColorEnum.BLACK)
                .setAge(5)
                .build();
        System.out.println(cat.getName() + "\n" +
                cat.getColor() + "\n" +
                cat.getAge());

    }

    private static void viewCar(Car car) {
        System.out.println(car.getMake() + "\n" +
                car.getModel() + "\n" +
                car.getYear() + "\n" +
                car.getFuelEnum() + "\n");
    }

    private static void personView(Person person) {
        System.out.println(person.getName() + "\n" +
                person.getSurname() + "\n" +
                person.getAge() + "\n" +
                person.getGender() + "\n" +
                person.getPesel() + "\n");
    }
}
