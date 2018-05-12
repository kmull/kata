package a.tmp.cwiczenia.builder;

import java.math.BigInteger;

public class Person {

    private String name;
    private String surname;

    private int age;
    private Color color;
    private BigInteger pesel;
    private String secondName;

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.color = builder.color;
        this.pesel = builder.pesel;
        this.secondName = builder.secondName;
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

    public Color getColor() {
        return color;
    }

    public BigInteger getPesel() {
        return pesel;
    }

    public String getSecondName() {
        return secondName;
    }

    public static class PersonBuilder {

        private String name;
        private String surname;

        private int age;
        private Color color;
        private BigInteger pesel;
        private String secondName;

        public PersonBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setColor(Color color) {
            this.color = color;
            return this;
        }

        public PersonBuilder setPesel(BigInteger pesel) {
            this.pesel = pesel;
            return this;
        }

        public PersonBuilder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

enum Color {
    WHITE,
    BLACK,
    YELLOW,
    RED
}
