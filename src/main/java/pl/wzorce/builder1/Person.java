package pl.wzorce.builder1;

import java.math.BigDecimal;

public class Person {

    //    required parameters
    private String name;
    private String surname;

    //    optional parameters
    private int age;
    private BigDecimal salary;
    private String pesel;

    //    Person constructor
    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.pesel = builder.pesel;
        this.salary = builder.salary;
    }

    public static class PersonBuilder {

        //        required parameters
        private String name;
        private String surname;
        //        optional parameters
        private int age;
        private BigDecimal salary;
        private String pesel;

        public PersonBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setSalary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder setPesel(String pesel) {
            this.pesel = pesel;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getPesel() {
        return pesel;
    }
}
