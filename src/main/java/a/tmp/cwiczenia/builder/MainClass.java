package a.tmp.cwiczenia.builder;

import java.math.BigInteger;

public class MainClass {

    public static void main(String[] args) {

        Person person = new Person.PersonBuilder("Kazik", "Nowak")
                .setAge(24)
                .setColor(Color.WHITE)
                .setPesel(new BigInteger("123456789"))
                .setSecondName("Roman")
                .build();

        System.out.println(person.getName() + " " +
                person.getSurname() + " " +
                person.getAge() + " " +
                person.getColor() + " " +
                person.getPesel() + " " +
                person.getSecondName());

        Car car = new Car.CarBuilder("Ania")
                .setAge(23)
                .setModel("Opel")
                .build();

        System.out.println(car.getName() + " " +
                car.getModel() + " " +
                car.getAge());
    }
}
