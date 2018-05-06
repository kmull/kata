package pl.wzorce.builder1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Glowna {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        Person person = new Person.PersonBuilder("Kazik", "Sachura")
                .setAge(23)
                .setSalary(BigDecimal.valueOf(3500.50))
                .setPesel("1234567890")
                .build();
        System.out.println(person.getAge());

        Car car = new Car.CarBuilder("Opel", "Astra")
                .setOwner("Kamil")
                .setYear(1998)
                .setColor(Color.BLUE)
                .build();
        carList.add(car);

        car = new Car.CarBuilder("Volkswagen", "Golf")
                .setOwner("Krzys")
                .setYear(1999)
                .setColor(Color.RED)
                .build();
        carList.add(car);

        for (Car tmpCar : carList) {
            System.out.println(tmpCar.getMake() + " " +
                    tmpCar.getModel() + " " +
                    tmpCar.getOwner() + " " +
                    tmpCar.getYear() + " " +
                    tmpCar.getColor());
        }
    }
}
