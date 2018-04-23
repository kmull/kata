package pl.wzorce.builder1;

import java.math.BigDecimal;

public class Glowna {

    public static void main(String[] args) {

        Person person = new Person.PersonBuilder("Kazik", "Sachura")
                .setAge(23)
                .setSalary(BigDecimal.valueOf(3500.50))
                .setPesel("1234567890")
                .build();

        System.out.println(person.getAge());
    }

}
